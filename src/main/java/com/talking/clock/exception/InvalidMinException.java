package com.talking.clock.exception;

public class InvalidMinException extends RuntimeException {
    public String getMessage(){
        return "Invalid Minutes  Entered!!";
    }
}
