package com.example.Exceptions;

public class IllegalPersonNameExeption extends Exception {
    public IllegalPersonNameExeption() {
        super();
    }

    public IllegalPersonNameExeption(String s) {
        super(s);
    }

    public IllegalPersonNameExeption(String message, Throwable cause) {
        super(message, cause);
    }
    public IllegalPersonNameExeption(Throwable cause) {
        super(cause);
    }
}
