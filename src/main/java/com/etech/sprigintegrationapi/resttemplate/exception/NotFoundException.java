package com.etech.sprigintegrationapi.resttemplate.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Exception exception) {
        super(message, exception);
    }
}

