package com.peerspace.spring.feign.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.peerspace.spring.feign.client.request.BookingDates;
import lombok.Data;

@Data
public class Booking {

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
