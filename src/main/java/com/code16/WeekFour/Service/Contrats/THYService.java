package com.code16.WeekFour.Service.Contrats;

import com.code16.WeekFour.Entity.Flight.Thy;

import java.util.List;

public interface THYService {
    void addTHY(Thy thy);

    void updateTHY(Thy thy);

    List<Thy> getAllTHY();

    Thy getTHYById(int id);

    void deleteTHY(int id);
}
