package com.code16.WeekFour.Service.Concrete;

import com.code16.WeekFour.Entity.Flight.Flight;
import com.code16.WeekFour.Entity.Flight.Pegasus;
import com.code16.WeekFour.Entity.Flight.Thy;
import com.code16.WeekFour.Repository.FlightRepository;
import com.code16.WeekFour.Service.Contrats.FlightService;
import com.code16.WeekFour.Service.Contrats.PegasusService;
import com.code16.WeekFour.Service.Contrats.THYService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class Admin implements FlightService, THYService, PegasusService {
    private final FlightRepository flightRepository;


    @Override
    public List<Flight> getAll() {
        return this.flightRepository.findAll();

    }

    @Override
    public Flight getById(int id) {
        Optional<Flight> flight = this.flightRepository.findById(id);
        return flight.orElse(null);
    }


    @Override
    public void delete(int id) {
        Flight flight = this.flightRepository.getById(id);
        this.flightRepository.delete(flight);
    }

    @Override
    public void addPegasus(Pegasus pegasus) {
        this.flightRepository.save(pegasus);
    }

    @Override
    public void updatePegasus(Pegasus pegasus) {
        this.flightRepository.save(pegasus);
    }

    @Override
    public List<Pegasus> getAllPegasus() {
        return this.flightRepository.findAll(new Pegasus());
    }

    @Override
    public Pegasus getPegasusById(int id) {
        Optional<Pegasus> pegasus = Optional.ofNullable(this.flightRepository.findPegasusById(id));
        return pegasus.orElse(null);
    }

    @Override
    public void deletePegasus(int id) {
        Pegasus pegasus = this.flightRepository.findPegasusById(id);
        this.flightRepository.delete(pegasus);
    }

    @Override
    public void addTHY(Thy thy) {
        this.flightRepository.save(thy);
    }

    @Override
    public void updateTHY(Thy thy) {
        this.flightRepository.save(thy);
    }

    @Override
    public List<Thy> getAllTHY() {
        return this.flightRepository.findAll(new Thy());
    }

    @Override
    public Thy getTHYById(int id) {
        Optional<Thy> thy = Optional.ofNullable(this.flightRepository.findTHYById(id));
        return thy.orElse(null);
    }

    @Override
    public void deleteTHY(int id) {
        Thy thy = this.flightRepository.findTHYById(id);
        this.flightRepository.delete(thy);
    }
}
