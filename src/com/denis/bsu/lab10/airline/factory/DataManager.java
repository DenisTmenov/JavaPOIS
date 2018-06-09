package com.denis.bsu.lab10.airline.factory;

import com.denis.bsu.lab10.airline.aircraft.CargoAircraft;
import com.denis.bsu.lab10.airline.aircraft.PassengerAircraft;
import com.denis.bsu.lab10.airline.builders.Builder;
import com.denis.bsu.lab10.airline.utils.Utils;

public class DataManager extends AbstractFactory {
    @Override
    public CargoAircraft createRandomCargoAircraft() {
        return new Builder().buildAircraft(new CargoAircraft("Cargo aircraft - " + (1 + Utils.getRand().nextInt(1000))));
    }

    @Override
    public PassengerAircraft createRandomPassengerAircraft() {
        return new Builder().buildAircraft(new PassengerAircraft("Passenger aircraft - " + (1 + Utils.getRand().nextInt(1000))));
    }
}
