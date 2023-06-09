package com.example.doctorbackend.error;

//by abdessamad
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }
}
