package com.peerspace.spring.feign.client.base;

import com.peerspace.spring.feign.client.request.CreateBookingRequestBody;
import com.peerspace.spring.feign.client.request.UpdateBookingRequestBody;
import com.peerspace.spring.feign.client.response.BookingId;
import com.peerspace.spring.feign.client.response.CreateBookingResponse;
import com.peerspace.spring.feign.client.response.GetBookingResponse;
import com.peerspace.spring.feign.client.response.UpdateBookingResponse;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import feign.Response;

import java.util.List;

@Headers({
        "Content-Type: application/json",
        "Accept: application/json"
})
public interface IBookingClient {

    @RequestLine("POST /booking")
    CreateBookingResponse createBooking(CreateBookingRequestBody requestBody);

    @RequestLine("GET /booking?firstname={firstName}&lastname={lastName}")
    List<BookingId> getBookingIds(@Param("firstName") String firstName, @Param("lastName") String lastName);

    @RequestLine("GET /booking/{bookingId}")
    GetBookingResponse getBooking(@Param("bookingId") int bookingId);

    @RequestLine("PUT /booking/{bookingId}")
    UpdateBookingResponse updateBooking(@Param("bookingId") int bookingId, UpdateBookingRequestBody requestBody);

    @RequestLine("DELETE /booking/{bookingId}")
    Response deleteBooking(@Param("bookingId") int bookingId);

}
