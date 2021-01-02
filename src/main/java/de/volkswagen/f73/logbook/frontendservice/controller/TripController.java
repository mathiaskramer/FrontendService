package de.volkswagen.f73.logbook.frontendservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.volkswagen.f73.logbook.frontendservice.model.Trip;
import de.volkswagen.f73.logbook.frontendservice.service.TripService;

@CrossOrigin(origins = "http//localhost:3000/*")
@RestController
@RequestMapping("/api")
public class TripController {

    @Autowired
    private TripService tripService;
    
 

    @CrossOrigin(origins = "*")
    @GetMapping("/get-trip")
    public List<Trip> getNewTrip() {
        return tripService.importTrip();
    }


}
