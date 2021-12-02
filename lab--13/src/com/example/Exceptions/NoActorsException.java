package com.example.Exceptions;

public class NoActorsException extends Exception {
    public NoActorsException() {
        super();
    }

    public NoActorsException(String s) {
        super(s);
    }

    public NoActorsException(String message, Throwable cause) {
        super(message, cause);
    }
    public NoActorsException(Throwable cause) {
        super(cause);
    }
}
