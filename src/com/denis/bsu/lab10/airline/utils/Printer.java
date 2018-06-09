package com.denis.bsu.lab10.airline.utils;

import com.denis.bsu.lab10.airline.aircraft.Aircraft;
import com.denis.bsu.lab10.airline.company.Airline;

public class Printer {

    public static void showAircraftsAirline(Airline airline) {
        StringBuilder sb = new StringBuilder();
        sb.append("Company \"").append(airline.getCompanyName()).append("\"\n\t");
        sb.append("aircrafts:").append("\n\t\t");
        airline.getAircrafts().forEach(aircraft -> {
            sb.append(aircraft.toString()).append("\n\t\t");
        });
        System.out.println(sb.toString());
    }

    public static void showAircrafts(AircraftList aircraftList) {
        StringBuilder sb = new StringBuilder();
        sb.append("Aircrafts:").append("\n\t\t");
        aircraftList.forEach(aircraft -> {
            sb.append(aircraft.toString()).append("\n\t\t");
        });
        System.out.println(sb.toString());
    }

    public static void showFullPassengersCountAirline(Airline airline) {
        Integer passengersCount = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("Company \"").append(airline.getCompanyName()).append("\"\n\t");
        sb.append("aircrafts = ").append(airline.getAircrafts().size()).append("\n\t");
        for (Aircraft aircraft : airline.getAircrafts()) {
            passengersCount += aircraft.getPassengersCount();
        }
        sb.append("passengers = ").append(passengersCount);
        System.out.println(sb.toString());
    }

    public static void showFullCargoAirline(Airline airline) {
        Integer cargoCapacity = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("Company \"").append(airline.getCompanyName()).append("\"\n\t");
        sb.append("aircrafts = ").append(airline.getAircrafts().size()).append("\n\t");
        for (Aircraft aircraft : airline.getAircrafts()) {
            cargoCapacity += aircraft.getCargoCapacity();
        }
        sb.append("cargo capacity = ").append(cargoCapacity);
        System.out.println(sb.toString());
    }

    public static void showEachAircraftMaxFlightRange(Airline airline) {
        StringBuilder sb = new StringBuilder();
        sb.append("Company \"").append(airline.getCompanyName()).append("\"\n\t");
        for (Aircraft aircraft : airline.getAircrafts()) {
            sb.append("Aircraft -> ").append(aircraft.getModelName()).append("\n\t\t");
            sb.append("flight range = ").append(aircraft.getMaxFlightRange()).append("\n\t");
        }
        System.out.println(sb.toString());
    }


}
