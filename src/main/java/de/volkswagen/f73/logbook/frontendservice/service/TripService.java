package de.volkswagen.f73.logbook.frontendservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.volkswagen.f73.logbook.frontendservice.model.Trip;
import de.volkswagen.f73.logbook.frontendservice.repository.TripRepository;

@Service
public class TripService {

    @Autowired TripRepository tripRepository;

	public List<Trip> importTrip() {
		return tripRepository.findAll();
	}
    
}
