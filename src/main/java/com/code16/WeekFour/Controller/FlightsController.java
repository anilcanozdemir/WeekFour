package com.code16.WeekFour.Controller;

import com.code16.WeekFour.Entity.Flight.Flight;
import com.code16.WeekFour.Entity.Flight.Pegasus;
import com.code16.WeekFour.Entity.Flight.Thy;
import com.code16.WeekFour.Service.Contrats.FlightService;
import com.code16.WeekFour.Service.Contrats.PegasusService;
import com.code16.WeekFour.Service.Contrats.THYService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/flights")
@RestController
@RequiredArgsConstructor
public class FlightsController {
    private final FlightService flightService;
    private final PegasusService pegasusService;
    private final THYService thyService;

/*
    @PostMapping("/add")
    public void add(@RequestBody Flight flight) {
        this.flightService.add(flight);
    }
    */
    /*
    FLIGHT SERVICE
     */

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

    /*
    PEGASUS SERVICE
     */
    @PostMapping("/addPegasus")
    public void add(@RequestBody Pegasus pegasus) {
        this.pegasusService.addPegasus(pegasus);
    }

    @GetMapping("/getAllPegasus")
    public List<Pegasus> getAllPegasus() {
        return this.pegasusService.getAllPegasus();
    }

    @GetMapping("/getPegasusById")
    public Flight getPegasusByid(@RequestParam int id) {
        return this.pegasusService.getPegasusById(id);
    }

    @PostMapping("/deletePegasus")
    public void deletePegasus(@RequestParam int id) {
        this.pegasusService.deletePegasus(id);
    }

    /*
    THY SERVICE
     */
    @PostMapping("/addTHY")
    public void add(@RequestBody Thy thy) {
        this.thyService.addTHY(thy);
    }

    @GetMapping("/getAllTHY")
    public List<Thy> getAllThy() {
        return this.thyService.getAllTHY();
    }

    @GetMapping("/getTHYById")
    public Flight getThyByid(@RequestParam int id) {
        return this.thyService.getTHYById(id);
    }

    @PostMapping("/deleteTHY")
    public void deleteThy(@RequestParam int id) {
        this.thyService.deleteTHY(id);
    }
}
