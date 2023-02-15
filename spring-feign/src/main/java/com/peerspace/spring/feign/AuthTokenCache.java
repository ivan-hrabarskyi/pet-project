package com.peerspace.spring.feign;

import com.peerspace.spring.feign.client.AuthClient;
import com.peerspace.spring.feign.domain.model.User;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class AuthTokenCache {
    public static Map<User, TokenInfo> userTokens;

    private AuthTokenCache(User user) {
        addUser(user);
    }

    public static String getToken(User user) {
        if (userTokens == null) {
            userTokens = new HashMap<>();
            addUser(user);
        }
        else if (!userTokens.containsKey(user)) {
            addUser(user);
        }
        else if (LocalDateTime.now().isAfter(userTokens.get(user).getTimeTokenCreated().plusMinutes(5))) {
            createNewTokenForUser(user);
        }
        return userTokens.get(user).getToken();
    }

    private static void addUser(User user) {
        var tokenInfo = createTokenInfo(user);
        userTokens.put(user, tokenInfo);
    }

    private static void createNewTokenForUser(User user) {
        var tokenInfo = createTokenInfo(user);
        userTokens.replace(user, tokenInfo);
    }

    private static TokenInfo createTokenInfo(User user) {
        TokenInfo tokenInfo = new TokenInfo();
        var response = AuthClient.withoutUser().createdToken(user);
        var token = response.getToken();
        tokenInfo.setToken(token);
        tokenInfo.setTimeTokenCreated(LocalDateTime.now());
        return tokenInfo;
    }

}
