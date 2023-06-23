package com.code16.WeekFour.Service.Contrats.Admin;

import com.code16.WeekFour.Entity.Flight.Pegasus;


public interface AdminPegasusService {
    void addPegasus(Pegasus pegasus);

    void updatePegasus(Pegasus pegasus);


    void deletePegasus(int id);
}
