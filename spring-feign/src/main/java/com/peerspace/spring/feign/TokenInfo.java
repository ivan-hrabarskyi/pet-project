package com.peerspace.spring.feign;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TokenInfo {

    private String token;
    private LocalDateTime timeTokenCreated;

}
