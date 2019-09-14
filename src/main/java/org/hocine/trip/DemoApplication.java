package org.hocine.trip;

import org.hocine.trip.entities.Traveler;
import org.hocine.trip.repositries.TravelerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner{
	@Autowired
  private TravelerRepositories travelerReposi;
  

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		travelerReposi.save(new Traveler(null,"hocine","mabrouki23@hotmail.fr"));
		travelerReposi.save(new Traveler(null,"hocine1","mabrouki23@hotmail.fr"));
		travelerReposi.save(new Traveler(null,"hocine2","mabrouki23@hotmail.fr"));
		
		
	}

}
