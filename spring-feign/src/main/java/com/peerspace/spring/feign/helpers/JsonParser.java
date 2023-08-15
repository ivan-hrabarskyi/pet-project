package com.peerspace.spring.feign.helpers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.SneakyThrows;

import java.io.InputStream;

public class JsonParser {

    @SneakyThrows
    public static <T> T parseFromInputStream(InputStream inputStream, Class<T> cls) {
        JsonMapper jsonMapper = JsonConfiguration.getStrictJsonMapper();
        return jsonMapper.readValue(StringHelper.getStringFromInputStream(inputStream), cls);
    }

}
