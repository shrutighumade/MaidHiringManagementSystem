package com.anudip.maid.service;

import java.util.List;

import com.anudip.maid.entity.Booking;

public interface BookingService {
    List<Booking> getAllBookings();
    Booking getBookingById(Long id);
    Booking saveBooking(Booking booking);
    void deleteBooking(Long id);

}
