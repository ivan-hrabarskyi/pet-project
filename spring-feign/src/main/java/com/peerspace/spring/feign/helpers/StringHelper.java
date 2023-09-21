package com.peerspace.spring.feign.helpers;

import feign.Util;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@UtilityClass
public class StringHelper {

    @SneakyThrows
    public static String getStringFromInputStream(InputStream inputStream) {
        byte[] responseData = Util.toByteArray(inputStream);
        return new String(responseData, StandardCharsets.UTF_8);
    }

}
