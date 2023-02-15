package com.peerspace.spring.feign.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with", builderMethodName = "anUser", toBuilder = true)
public class User {

    private String username;
    private String password;

}
