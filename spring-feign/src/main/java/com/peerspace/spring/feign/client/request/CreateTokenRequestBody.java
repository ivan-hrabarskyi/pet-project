package com.peerspace.spring.feign.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateTokenRequestBody {

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

}
