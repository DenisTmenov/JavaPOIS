package com.denis.bsu.lab10.airline.utils;

import java.util.Random;

public class Utils {
    private static Random rand;


    public static Random getRand() {
        if (rand == null) {
            rand = new Random();
        }
        return rand;
    }
}
