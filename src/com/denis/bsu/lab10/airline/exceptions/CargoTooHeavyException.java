package com.denis.bsu.lab10.airline.exceptions;

public class CargoTooHeavyException extends CargoException {
    private static final long serialVersionUID = 3802431382371640519L;

    public CargoTooHeavyException() {
        super();
    }

    public CargoTooHeavyException(String message) {
        super(message);
    }

    public CargoTooHeavyException(String message, Throwable cause) {
        super(message, cause);
    }
}
