package com.denis.bsu.lab10.airline.factory;

import com.denis.bsu.lab10.airline.aircraft.CargoAircraft;
import com.denis.bsu.lab10.airline.aircraft.PassengerAircraft;

abstract class AbstractFactory {

    abstract public CargoAircraft createRandomCargoAircraft();

    abstract public PassengerAircraft createRandomPassagerAircraft();
}
