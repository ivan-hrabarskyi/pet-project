package com.peerspace.spring.feign.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.peerspace.spring.feign.client.request.BookingDates;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GetBookingResponse {

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("lastname")
    private String lastName;

    @JsonProperty("totalprice")
    private int totalPrice;

    @JsonProperty("depositpaid")
    private Boolean depositPaid;

    @JsonProperty("bookingdates")
    private BookingDates bookingDates;

    @JsonProperty("additionalneeds")
    private String additionalNeeds;


}
