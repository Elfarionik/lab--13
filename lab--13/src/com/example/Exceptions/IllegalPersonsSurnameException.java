package com.example.Exceptions;

public class IllegalPersonsSurnameException extends Exception {
    public IllegalPersonsSurnameException() {
        super();
    }

    public IllegalPersonsSurnameException(String s) {
        super(s);
    }

    public IllegalPersonsSurnameException(String message, Throwable cause) {
        super(message, cause);
    }
    public IllegalPersonsSurnameException(Throwable cause) {
        super(cause);
    }
}