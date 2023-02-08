package com.peerspace.spring.feign.client.targets;


import com.peerspace.spring.feign.domain.model.User;
import com.peerspace.spring.feign.client.AuthClient;
import feign.Request;
import feign.RequestTemplate;
import feign.Target;

public class DynamicAuthTokenTarget<T> implements Target<T> {

    private final Class<T> cls;
    private final String url;
    private final User user;

    public DynamicAuthTokenTarget(Class<T> cls, User user) {
        this.cls = cls;
        this.url = "https://restful-booker.herokuapp.com";
        this.user = user;
    }

    @Override
    public Class<T> type() {
        return cls;
    }

    @Override
    public String name() {
        return "empty:" + cls.getSimpleName();
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Request apply(RequestTemplate input) {

        if (input.url().indexOf("http") != 0) {
            input.target(url);
        }

        var response = AuthClient.withoutUser().createdToken(user);
        var token = response.getToken();
        input.header("Cookie", "token=" + token);

        return input.request();
    }
}
