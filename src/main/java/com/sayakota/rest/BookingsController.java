package com.sayakota.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sayakota.model.Bookings;
import com.sayakota.repo.BookingRepository;

@RestController
public class BookingsController {

	@Autowired BookingRepository repo;
	
	@RequestMapping("/booksings")
	Collection<Bookings> bookings() {
		return this.repo.findAll();
	}
}
