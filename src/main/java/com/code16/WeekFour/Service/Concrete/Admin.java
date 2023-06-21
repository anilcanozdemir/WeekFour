package com.code16.WeekFour.Service.Concrete;

import com.code16.WeekFour.Entity.Flight.Flight;
import com.code16.WeekFour.Repository.FlightRepository;
import com.code16.WeekFour.Service.Contrats.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class Admin implements FlightService {
    private final FlightRepository flightRepository;
    @Override
    public void add(Flight flight) {
        this.flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAll() {
        return this.flightRepository.findAll();

    }

    @Override
    public Flight getById(int id) {
        Optional<Flight> flight= this.flightRepository.findById(id);
        return flight.orElse(null);
    }

    @Override
    public void update(Flight flight) {
    this.flightRepository.save(flight);
    }

    @Override
    public void delete(int id) {
    Flight flight=this.flightRepository.getById(id);
    this.flightRepository.delete(flight);
    }
}
