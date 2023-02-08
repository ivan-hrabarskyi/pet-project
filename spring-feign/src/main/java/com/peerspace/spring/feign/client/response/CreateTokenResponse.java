package com.peerspace.spring.feign.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateTokenResponse {

    @JsonProperty("token")
    private String token;

}
