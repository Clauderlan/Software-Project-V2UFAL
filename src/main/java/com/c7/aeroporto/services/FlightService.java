package com.c7.aeroporto.services;


import com.c7.aeroporto.entities.Flight;
import com.c7.aeroporto.repositories.FlightRepository;
import com.c7.aeroporto.repositories.PlaneRepository;
import com.c7.aeroporto.services.exceptions.ResourceNotFoundException;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebResourcesRuntimeHints;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PlaneRepository planeRepository;

    // GET Methods

    public List<Flight> findAll(){
        return flightRepository.findAll();
    }

    public Flight findById(Long id){
        return flightRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }


    public Flight findByPlaneName(String planeName) {

        return flightRepository.findByPlaneName(planeName).orElseThrow(() -> new ResourceNotFoundException(planeName));
    }
}
