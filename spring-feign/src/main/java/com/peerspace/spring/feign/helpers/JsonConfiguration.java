package com.peerspace.spring.feign.helpers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class JsonConfiguration {

    private static final ThreadLocal<JsonMapper> jsonMapper = ThreadLocal.withInitial(() -> JsonMapper.builder()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .build());

    public static JsonMapper getStrictJsonMapper() {
        return jsonMapper.get();
    }

}
