package com.code16.WeekFour.Repository;

import com.code16.WeekFour.Entity.Flight.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {
    Flight getById(int id);
}
