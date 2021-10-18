package com.talking.clock.exception;

public class InvalidHoursException extends RuntimeException {

    public String getMessage(){
        return "Invalid Hours Entered!!";
    }
}
