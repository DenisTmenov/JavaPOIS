package com.denis.bsu.lab10.airline.interfaces;

import com.denis.bsu.lab10.airline.aircraft.Aircraft;

public interface BuilderInt {

    <E extends Aircraft> E buildAircraft(E airCraft);

}
