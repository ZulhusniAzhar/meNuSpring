package com.zulhusnidev.meNu.exception;

public class MenuNotFoundException extends RuntimeException{
    public MenuNotFoundException(String message){
        super(message);
    }
}
