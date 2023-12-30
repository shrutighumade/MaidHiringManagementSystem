package com.anudip.maid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anudip.maid.entity.Booking;


//BookingRepository.java
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>  {
	

}
