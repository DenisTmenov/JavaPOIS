package com.denis.bsu.lab10.airline.exceptions;

public class AircraftEmptyException extends RuntimeException {
    public AircraftEmptyException() {
        super();
    }

    public AircraftEmptyException(String message) {
        super(message);
    }

    public AircraftEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
