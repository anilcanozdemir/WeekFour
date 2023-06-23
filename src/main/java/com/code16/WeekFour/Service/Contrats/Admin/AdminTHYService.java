package com.code16.WeekFour.Service.Contrats.Admin;

import com.code16.WeekFour.Entity.Flight.Thy;


public interface AdminTHYService {
    void addTHY(Thy thy);

    void updateTHY(Thy thy);


    void deleteTHY(int id);
}
