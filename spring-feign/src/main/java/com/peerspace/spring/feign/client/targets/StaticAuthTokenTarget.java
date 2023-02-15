package com.peerspace.spring.feign.client.targets;

import feign.Request;
import feign.RequestTemplate;
import feign.Target;

public class StaticAuthTokenTarget<T> implements Target<T> {

    private final Class<T> cls;
    private final String url;
    private final String token;

    public StaticAuthTokenTarget(Class<T> cls, String token) {
        this.cls = cls;
        this.url = "https://restful-booker.herokuapp.com";
        this.token = token;
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

        input.header("Cookie", "token=" + token);

        return input.request();

    }
}
