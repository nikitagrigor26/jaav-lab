package org.example;

public class DepNotFoundException extends RuntimeException {
    public DepNotFoundException(String message) {
        super(message);
    }
}
