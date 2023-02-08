package com.peerspace.spring.feign.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CreateBookingResponse {

    @JsonProperty("bookingid")
    private int bookingId;

    @JsonProperty("booking")
    private Booking booking;

}
