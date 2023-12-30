package com.anudip.maid.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.maid.entity.Booking;
import com.anudip.maid.repository.BookingRepository;
import com.anudip.maid.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
    BookingRepository bookingRepository;
    
    


    @Autowired
	public BookingServiceImpl(BookingRepository bookingRepository) {
		
		this.bookingRepository = bookingRepository;
	}

	@Override
	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

	@Override
	public Booking getBookingById(Long id) {
		// TODO Auto-generated method stub
		return bookingRepository.findById(id).orElse(null);
	}

	@Override
	public Booking saveBooking(Booking booking) {
		// TODO Auto-generated method stub
		return  bookingRepository.save(booking);
    
	}

	@Override
	public void deleteBooking(Long id) {
		// TODO Auto-generated method stub
		bookingRepository.deleteById(id);
		
	}

	
}
