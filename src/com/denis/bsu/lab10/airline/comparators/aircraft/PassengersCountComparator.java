package com.denis.bsu.lab10.airline.comparators.aircraft;

import com.denis.bsu.lab10.airline.aircraft.Aircraft;

public class PassengersCountComparator extends AircraftComparator {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getPassengersCount().compareTo(o2.getPassengersCount());
    }
}
