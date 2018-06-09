package com.denis.bsu.lab10.airline.builders;

import com.denis.bsu.lab10.airline.aircraft.Aircraft;

import java.io.Serializable;

abstract class AbstractBuilder implements Serializable {

    private static final long serialVersionUID = 187483830470931148L;

    abstract <E extends Aircraft> E buildAircraft(E airCraft);

}
