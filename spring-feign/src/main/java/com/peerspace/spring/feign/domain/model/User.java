package com.peerspace.spring.feign.domain.model;

import lombok.*;

@Data
@Builder(setterPrefix = "with", builderMethodName = "anUser", toBuilder = true)
@ToString
public class User {

    private Integer id;
    private String username;
    private String password;

}
