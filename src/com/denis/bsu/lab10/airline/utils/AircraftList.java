package com.denis.bsu.lab10.airline.utils;

import com.denis.bsu.lab10.airline.aircraft.Aircraft;

import java.util.ArrayList;

public class AircraftList extends ArrayList<Aircraft> {
    private static final long serialVersionUID = 3217102877728949601L;

    private final static Integer DEFAULT_CAPACITY = 8;

    public AircraftList() {
        super(DEFAULT_CAPACITY);
    }

}
