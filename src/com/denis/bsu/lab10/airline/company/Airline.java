package com.denis.bsu.lab10.airline.company;

import com.denis.bsu.lab10.airline.aircraft.Aircraft;
import com.denis.bsu.lab10.airline.comparators.aircraft.AircraftEnum;
import com.denis.bsu.lab10.airline.utils.AircraftList;

public class Airline extends Company {

    private AircraftList aircrafts;

    public Airline(String companyName) {
        super(companyName);
        aircrafts = new AircraftList();
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public AircraftList getAircrafts() {
        return aircrafts != null ? aircrafts : new AircraftList();
    }

    public void sortAircrafrs(AircraftEnum comparator) {
        aircrafts.sort(comparator.get());
    }
}
