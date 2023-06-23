package com.code16.WeekFour.Service.Concrete;

import com.code16.WeekFour.Entity.Flight.Flight;
import com.code16.WeekFour.Entity.Flight.Pegasus;
import com.code16.WeekFour.Entity.Flight.Thy;
import com.code16.WeekFour.Repository.FlightRepository;
import com.code16.WeekFour.Service.Contrats.User.UserFlightService;
import com.code16.WeekFour.Service.Contrats.User.UserPegasusService;
import com.code16.WeekFour.Service.Contrats.User.UserTHYService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

;


@RequiredArgsConstructor
@Service
public class User implements UserFlightService, UserTHYService, UserPegasusService {

    final FlightRepository flightRepository;

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
    public List<Pegasus> getAllPegasus() {
        return this.flightRepository.findAll(new Pegasus());
    }

    @Override
    public Pegasus getPegasusById(int id) {
        Optional<Pegasus> pegasus = Optional.ofNullable(this.flightRepository.findPegasusById(id));
        return pegasus.orElse(null);
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

}
