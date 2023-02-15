package com.peerspace.spring.feign.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BookingId {

    @JsonProperty("bookingid")
    private int bookingId;

}
