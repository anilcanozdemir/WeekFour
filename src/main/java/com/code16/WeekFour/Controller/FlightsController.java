package com.code16.WeekFour.Controller;

import com.code16.WeekFour.Entity.Flight.Flight;
import com.code16.WeekFour.Entity.Flight.THY;
import com.code16.WeekFour.Service.Contrats.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/flights")
@RestController
@RequiredArgsConstructor
public class FlightsController {
    private final FlightService flightService;


    @PostMapping("/add")
    public void add(@RequestBody Flight flight) {
        this.flightService.add(flight);
    }

    @GetMapping("/getAll")
    public List<Flight> getAll() {
        return this.flightService.getAll();
    }

    @GetMapping("/getById")
    public Flight getByid(@RequestParam int id) {
        return this.flightService.getById(id);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam int id) {
        this.flightService.delete(id);
    }
}
