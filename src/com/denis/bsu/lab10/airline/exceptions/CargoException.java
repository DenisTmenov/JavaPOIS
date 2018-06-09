package com.denis.bsu.lab10.airline.exceptions;

public class CargoException extends RuntimeException {
    private static final long serialVersionUID = 2423557641629951385L;

    public CargoException() {
        super();
    }

    public CargoException(String message) {
        super(message);
    }

    public CargoException(String message, Throwable cause) {
        super(message, cause);
    }
}
