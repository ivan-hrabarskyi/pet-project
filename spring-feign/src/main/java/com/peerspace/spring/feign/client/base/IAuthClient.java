package com.peerspace.spring.feign.client.base;

import com.peerspace.spring.feign.client.request.CreateTokenRequestBody;
import com.peerspace.spring.feign.client.response.CreateTokenResponse;
import feign.Headers;
import feign.RequestLine;

@Headers({
        "Content-Type: application/json"
})
public interface IAuthClient {

    @RequestLine("POST /auth")
    CreateTokenResponse createToken(CreateTokenRequestBody requestBody);

}
