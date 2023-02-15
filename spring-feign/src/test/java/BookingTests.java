import com.peerspace.spring.feign.client.BookingClient;
import com.peerspace.spring.feign.client.request.BookingDates;
import com.peerspace.spring.feign.client.request.CreateBookingRequestBody;
import com.peerspace.spring.feign.client.request.UpdateBookingRequestBody;
import com.peerspace.spring.feign.client.response.BookingId;
import com.peerspace.spring.feign.domain.model.User;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

public class BookingTests {

    @Test
    void firstTest() {

        ThreadLocal<User> userThreadLocal = new ThreadLocal<>();

        userThreadLocal.set(User.anUser()
                .withId(1)
                .withUsername("admin")
                .withPassword("password123")
                .build());

        // Create Bookings

        var bookingDates = BookingDates.anBookingDates()
                .withCheckin(LocalDate.of(2023, 2, 1).toString())
                .withCheckout(LocalDate.of(2023, 2, 6).toString())
                .build();

        var defaultCreateBookingRequestBody = CreateBookingRequestBody.anBooking()
                .withFirstname("Sean")
                .withLastname("Pierce")
                .withBookingDates(bookingDates)
                .build();

        var createBookingRequestBodyOne = defaultCreateBookingRequestBody.toBuilder()
                .withDepositPaid(true)
                .withTotalPrice(740)
                .withAdditionalNeeds("Breakfast")
                .build();

        var createBookingRequestBodyTwo = defaultCreateBookingRequestBody.toBuilder()
                .withDepositPaid(false)
                .withTotalPrice(241)
                .withAdditionalNeeds("Dinner")
                .build();

        var createBookingRequestBodyThree = defaultCreateBookingRequestBody.toBuilder()
                .withDepositPaid(true)
                .withTotalPrice(1884)
                .withAdditionalNeeds("Supper")
                .build();

        var createdBookingsResponse = BookingClient.withoutUser().createListOfBookings(List.of(
                createBookingRequestBodyOne,
                createBookingRequestBodyTwo,
                createBookingRequestBodyThree,
                createBookingRequestBodyTwo,
                createBookingRequestBodyThree,
                createBookingRequestBodyOne,
                createBookingRequestBodyThree,
                createBookingRequestBodyTwo,
                createBookingRequestBodyOne,
                createBookingRequestBodyThree
        ));

        // Getting booking Ids

        var getBookingsIds = BookingClient.withoutUser().getBookingIds("Sean", "Pierce");
        System.out.println(getBookingsIds);

        // UpdateBookings

        var updateBookingOneRequestBody = UpdateBookingRequestBody.anRequestBody()
                .withFirstname("Sean")
                .withLastname("Pierce")
                .withDepositPaid(false)
                .withTotalPrice(560)
                .withBookingDates(bookingDates)
                .withAdditionalNeeds("Breakfast")
                .build();

        var updateBookingTwoRequestBody = UpdateBookingRequestBody.anRequestBody()
                .withFirstname("Sean")
                .withLastname("Pierce")
                .withDepositPaid(true)
                .withTotalPrice(980)
                .withBookingDates(bookingDates)
                .withAdditionalNeeds("Dinner")
                .build();

        var updateBookingThreeRequestBody = UpdateBookingRequestBody.anRequestBody()
                .withFirstname("Sean")
                .withLastname("Pierce")
                .withDepositPaid(true)
                .withTotalPrice(1400)
                .withBookingDates(bookingDates)
                .withAdditionalNeeds("Supper")
                .build();

        BookingClient.forUser(userThreadLocal.get())
                .updateBooking(createdBookingsResponse.get(0).getBookingId(), updateBookingOneRequestBody);
        BookingClient.forUser(userThreadLocal.get())
                .updateBooking(createdBookingsResponse.get(1).getBookingId(), updateBookingTwoRequestBody);
        BookingClient.forUser(userThreadLocal.get())
                .updateBooking(createdBookingsResponse.get(2).getBookingId(), updateBookingThreeRequestBody);

        // Getting all bookings

        var allBookingsIds = BookingClient.withoutUser().getBookingIds("Sean", "Pierce").stream().map(BookingId::getBookingId).toList();

        BookingClient.withoutUser().getListOfBookings(allBookingsIds);

        // Delete all bookings

        BookingClient.forUser(userThreadLocal.get()).deleteListOfBookings(allBookingsIds);
    }

    @Test
    void secondTest() {

        ThreadLocal<User> userThreadLocal = new ThreadLocal<>();

        userThreadLocal.set(User.anUser()
                .withId(2)
                .withUsername("admin")
                .withPassword("password123")
                .build());

        // Create Bookings

        var bookingDates = BookingDates.anBookingDates()
                .withCheckin(LocalDate.of(2023, 2, 1).toString())
                .withCheckout(LocalDate.of(2023, 2, 6).toString())
                .build();

        var defaultCreateBookingRequestBody = CreateBookingRequestBody.anBooking()
                .withFirstname("Daniel")
                .withLastname("Harrelson")
                .withBookingDates(bookingDates)
                .build();

        var createBookingRequestBodyOne = defaultCreateBookingRequestBody.toBuilder()
                .withDepositPaid(true)
                .withTotalPrice(1849)
                .withAdditionalNeeds("Breakfast")
                .build();

        var createBookingRequestBodyTwo = defaultCreateBookingRequestBody.toBuilder()
                .withDepositPaid(false)
                .withTotalPrice(203)
                .withAdditionalNeeds("Dinner")
                .build();

        var createBookingRequestBodyThree = defaultCreateBookingRequestBody.toBuilder()
                .withDepositPaid(true)
                .withTotalPrice(183)
                .withAdditionalNeeds("Supper")
                .build();

        var createdBookingsResponse = BookingClient.withoutUser().createListOfBookings(List.of(
                createBookingRequestBodyOne,
                createBookingRequestBodyTwo,
                createBookingRequestBodyThree,
                createBookingRequestBodyTwo,
                createBookingRequestBodyThree,
                createBookingRequestBodyOne,
                createBookingRequestBodyThree,
                createBookingRequestBodyTwo,
                createBookingRequestBodyOne,
                createBookingRequestBodyThree
        ));

        // Getting booking Ids

        var getBookingsIds = BookingClient.withoutUser().getBookingIds("Daniel", "Harrelson");
        System.out.println(getBookingsIds);

        // UpdateBookings

        var updateBookingOneRequestBody = UpdateBookingRequestBody.anRequestBody()
                .withFirstname("Daniel")
                .withLastname("Harrelson")
                .withDepositPaid(false)
                .withTotalPrice(573)
                .withBookingDates(bookingDates)
                .withAdditionalNeeds("Breakfast")
                .build();

        var updateBookingTwoRequestBody = UpdateBookingRequestBody.anRequestBody()
                .withFirstname("Daniel")
                .withLastname("Harrelson")
                .withDepositPaid(true)
                .withTotalPrice(234)
                .withBookingDates(bookingDates)
                .withAdditionalNeeds("Dinner")
                .build();

        var updateBookingThreeRequestBody = UpdateBookingRequestBody.anRequestBody()
                .withFirstname("Daniel")
                .withLastname("Harrelson")
                .withDepositPaid(true)
                .withTotalPrice(923)
                .withBookingDates(bookingDates)
                .withAdditionalNeeds("Supper")
                .build();

        BookingClient.forUser(userThreadLocal.get())
                .updateBooking(createdBookingsResponse.get(0).getBookingId(), updateBookingOneRequestBody);
        BookingClient.forUser(userThreadLocal.get())
                .updateBooking(createdBookingsResponse.get(1).getBookingId(), updateBookingTwoRequestBody);
        BookingClient.forUser(userThreadLocal.get())
                .updateBooking(createdBookingsResponse.get(2).getBookingId(), updateBookingThreeRequestBody);

        // Getting all bookings

        var allBookingsIds = BookingClient.withoutUser().getBookingIds("Daniel", "Harrelson").stream().map(BookingId::getBookingId).toList();

        BookingClient.withoutUser().getListOfBookings(allBookingsIds);

        // Delete all bookings

        BookingClient.forUser(userThreadLocal.get()).deleteListOfBookings(allBookingsIds);
    }

}
