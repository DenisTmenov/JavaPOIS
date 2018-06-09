package com.denis.bsu.lab10.airline.comparators.aircraft;

import com.denis.bsu.lab10.airline.aircraft.Aircraft;

public class MaxFuelCapacityComparator extends AircraftComparator {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getMaxFuelCapacity().compareTo(o2.getMaxFuelCapacity());
    }
}
