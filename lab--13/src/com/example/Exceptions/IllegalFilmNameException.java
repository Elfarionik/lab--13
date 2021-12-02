package com.example.Exceptions;

public class IllegalFilmNameException extends Exception {
    public IllegalFilmNameException() {
        super();
    }

    public IllegalFilmNameException(String s) {
        super(s);
    }

    public IllegalFilmNameException(String message, Throwable cause) {
        super(message, cause);
    }
    public IllegalFilmNameException(Throwable cause) {
        super(cause);
    }
}
