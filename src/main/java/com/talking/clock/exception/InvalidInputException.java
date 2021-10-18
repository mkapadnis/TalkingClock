package com.talking.clock.exception;

public class InvalidInputException extends RuntimeException {

    String message;
    public  InvalidInputException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
