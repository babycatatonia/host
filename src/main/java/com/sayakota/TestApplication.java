package com.sayakota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.sayakota.model.Bookings;
import com.sayakota.repo.BookingRepository;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}

@Component
class BookingsCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception {
		
		for( Bookings b: this.bookrepo.findAll())
			System.out.println(b.toString());
	}
	
	@Autowired BookingRepository bookrepo;
	
}
