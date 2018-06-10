package com.denis.bsu.lab10.airline.exceptions;

public class IOWriteException extends IOWorkerException {
    public IOWriteException() {
        super();
    }

    public IOWriteException(String message) {
        super(message);
    }

    public IOWriteException(String message, Throwable cause) {
        super(message, cause);
    }
}
