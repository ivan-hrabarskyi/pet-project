package com.peerspace.spring.feign.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.peerspace.spring.feign.client.targets.DynamicAuthTokenTarget;
import com.peerspace.spring.feign.client.base.IBookingClient;
import com.peerspace.spring.feign.client.targets.StaticAuthTokenTarget;
import com.peerspace.spring.feign.domain.model.User;
import com.peerspace.spring.feign.client.request.CreateBookingRequestBody;
import com.peerspace.spring.feign.client.request.UpdateBookingRequestBody;
import com.peerspace.spring.feign.client.response.BookingId;
import com.peerspace.spring.feign.client.response.CreateBookingResponse;
import com.peerspace.spring.feign.client.response.GetBookingResponse;
import com.peerspace.spring.feign.client.response.UpdateBookingResponse;
import feign.Feign;
import feign.Response;
import feign.form.FormEncoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BookingClient {

    private final IBookingClient bookingClient;

    public static BookingClient withoutUser() {
        return new BookingClient();
    }

    public static BookingClient withToken(String token) {
        return new BookingClient(token);
    }

    public static BookingClient forUser(User user) {
        return new BookingClient(user);
    }

    private BookingClient() {
        ObjectMapper objectMapper = new ObjectMapper();

        this.bookingClient = Feign.builder()
                .encoder(new FormEncoder(new JacksonEncoder(objectMapper)))
                .decoder(new JacksonDecoder(objectMapper))
                .target(IBookingClient.class, "https://restful-booker.herokuapp.com");
    }

    private BookingClient(String token) {
        ObjectMapper objectMapper = new ObjectMapper();

        this.bookingClient = Feign.builder()
                .encoder(new FormEncoder(new JacksonEncoder(objectMapper)))
                .decoder(new JacksonDecoder(objectMapper))
                .target(new StaticAuthTokenTarget<>(IBookingClient.class, token));
    }

    private BookingClient(User user) {
        ObjectMapper objectMapper = new ObjectMapper();

        this.bookingClient = Feign.builder()
                .encoder(new FormEncoder(new JacksonEncoder(objectMapper)))
                .decoder(new JacksonDecoder(objectMapper))
                .target(new DynamicAuthTokenTarget<>(IBookingClient.class, user));
    }

    public CreateBookingResponse createBooking(CreateBookingRequestBody body) {
        return bookingClient.createBooking(body);
    }

    public List<BookingId> getBookingIds(String firstName, String lastName) {
        log.info("Getting booking ids with " + firstName + " firstname and " + lastName + " lastname");
        return bookingClient.getBookingIds(firstName, lastName);
    }

    public GetBookingResponse getBooking(int bookingId) {
        return bookingClient.getBooking(bookingId);
    }

    public UpdateBookingResponse updateBooking(int bookingId, UpdateBookingRequestBody body) {
        log.info("Update booking with " + bookingId + " id");
        return bookingClient.updateBooking(bookingId, body);
    }

    public Response deleteBooking(int bookingId) {
        return bookingClient.deleteBooking(bookingId);
    }

    public List<CreateBookingResponse> createListOfBookings(List<CreateBookingRequestBody> bodies) {
        log.info("Create list of bookings");
        return bodies.stream()
                .map(body -> {
                    var createdBooking = bookingClient.createBooking(body);
                    log.info("Created booking: " + createdBooking);
                    return createdBooking;
                }).toList();
    }

    public List<GetBookingResponse> getListOfBookings(List<Integer> bookingIds) {
        log.info("Getting list of bookings");
        var foundBookings = bookingIds.stream().map(bookingId -> {
            var booking = bookingClient.getBooking(bookingId);
            log.info("Received booking: " + booking);
            return booking;
        }).toList();
        log.info("Found " + foundBookings.size() + " bookings");
        return foundBookings;
    }

    public List<Response> deleteListOfBookings(List<Integer> bookingIds) {
        log.info("Delete list of bookings");
        return bookingIds.stream()
                .map(bookingId -> {
                    var deletedBooking = bookingClient.deleteBooking(bookingId);
                    log.info("Booking with " + bookingId + " id is deleted");
                    return deletedBooking;
                }).toList();
    }

}
