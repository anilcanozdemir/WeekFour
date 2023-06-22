package com.code16.WeekFour.Service.Contrats;

import com.code16.WeekFour.Entity.Flight.Pegasus;

import java.util.List;

public interface PegasusService {
    void addPegasus(Pegasus pegasus);

    void updatePegasus(Pegasus pegasus);

    List<Pegasus> getAllPegasus();

    Pegasus getPegasusById(int id);

    void deletePegasus(int id);
}
