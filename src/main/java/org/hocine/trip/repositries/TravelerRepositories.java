package org.hocine.trip.repositries;


import org.hocine.trip.entities.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelerRepositories extends JpaRepository<Traveler, Long> {

	
}
