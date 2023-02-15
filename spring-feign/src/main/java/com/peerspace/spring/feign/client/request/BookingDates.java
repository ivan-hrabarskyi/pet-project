package com.peerspace.spring.feign.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder(setterPrefix = "with", builderMethodName = "anBookingDates")
@AllArgsConstructor
@NoArgsConstructor
public class BookingDates {

    @JsonProperty("checkin")
    private String checkin;

    @JsonProperty("checkout")
    private String checkout;

}
