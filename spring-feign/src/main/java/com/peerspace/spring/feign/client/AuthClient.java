package com.peerspace.spring.feign.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.peerspace.spring.feign.client.base.IAuthClient;
import com.peerspace.spring.feign.domain.model.User;
import com.peerspace.spring.feign.client.request.CreateTokenRequestBody;
import com.peerspace.spring.feign.client.response.CreateTokenResponse;
import feign.Feign;
import feign.form.FormEncoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class AuthClient {

    private final IAuthClient authClient;

    public static AuthClient withoutUser() {
        return new AuthClient();
    }

    private AuthClient() {
        ObjectMapper objectMapper = new ObjectMapper();

        this.authClient = Feign.builder()
                .encoder(new FormEncoder(new JacksonEncoder(objectMapper)))
                .decoder(new JacksonDecoder(objectMapper))
                .target(IAuthClient.class, "https://restful-booker.herokuapp.com");

    }

    public CreateTokenResponse createdToken(User user) {
        CreateTokenRequestBody body = new CreateTokenRequestBody();
        body.setUsername(user.getUsername());
        body.setPassword(user.getPassword());

        return authClient.createToken(body);
    }

}
