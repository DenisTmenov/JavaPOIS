package com.denis.bsu.lab10.airline.exceptions;

public class IOReadException extends IOWorkerException {
    public IOReadException() {
        super();
    }

    public IOReadException(String message) {
        super(message);
    }

    public IOReadException(String message, Throwable cause) {
        super(message, cause);
    }
}
