package com.denis.bsu.lab10.airline.exceptions;

public class IOWorkerException extends RuntimeException {
    public IOWorkerException() {
        super();
    }

    public IOWorkerException(String message) {
        super(message);
    }

    public IOWorkerException(String message, Throwable cause) {
        super(message, cause);
    }
}
