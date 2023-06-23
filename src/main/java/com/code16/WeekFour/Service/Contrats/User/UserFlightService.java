package com.code16.WeekFour.Service.Contrats.User;

import com.code16.WeekFour.Entity.Flight.Flight;

import java.util.List;

public interface UserFlightService {

    List<Flight> getAll();

    Flight getById(int id);


}
