package com.sayakota.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayakota.model.Bookings;

public interface BookingRepository extends JpaRepository<Bookings, Long>{
	
	Collection<Bookings> findByBookingName(String bookingName);

}
