package com.denis.bsu.lab10.airline.interfaces;

import com.denis.bsu.lab10.airline.exceptions.CargoTooHeavyException;

public interface AircraftInt {
    void flightTo(String destination);

    void loadCargo(Integer weight) throws CargoTooHeavyException;
}
