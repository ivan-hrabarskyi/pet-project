package com.peerspace.spring.feign.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder(setterPrefix = "with", builderMethodName = "anBooking", toBuilder = true)
public class CreateBookingRequestBody {

    @JsonProperty("firstname")
    private String firstname;

    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("totalprice")
    private Integer totalPrice;

    @JsonProperty("depositpaid")
    private Boolean depositPaid;

    @JsonProperty("bookingdates")
    private BookingDates bookingDates;

    @JsonProperty("additionalneeds")
    private String additionalNeeds;


}
