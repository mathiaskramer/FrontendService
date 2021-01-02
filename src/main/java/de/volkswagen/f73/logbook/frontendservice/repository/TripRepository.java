package de.volkswagen.f73.logbook.frontendservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.volkswagen.f73.logbook.frontendservice.model.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    
}
