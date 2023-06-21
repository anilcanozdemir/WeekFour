package com.code16.WeekFour.Service.Contrats;

import com.code16.WeekFour.Entity.Flight.Flight;

import java.util.List;

public interface FlightService {

    List<Flight> getAll();
    Flight getById(int id);

    void delete(int flight);

    void add(Flight flight);
    void update(Flight flight);
}
