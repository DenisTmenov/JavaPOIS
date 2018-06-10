package com.denis.bsu.lab10.airline.exceptions;

public class ReadFileException extends IOReadException {
    public ReadFileException() {
    }

    public ReadFileException(String message) {
        super(message);
    }

    public ReadFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
