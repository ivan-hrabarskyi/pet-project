package com.peerspace.spring.feign.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.peerspace.spring.feign.client.request.BookingDates;
import lombok.Data;

/**
 * It is able to mark a single class as accepting unknown fields,
 * instead of the entire Jackson ObjectMapper
 * using @JsonIgnoreProperties(ignoreUnknown = true) annotation
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateBookingResponse {

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

//    @JsonProperty("additionalneeds")
//    private String additionalNeeds;

}
