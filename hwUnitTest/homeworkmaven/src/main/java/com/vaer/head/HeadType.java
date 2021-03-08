package com.vaer.head;

public enum HeadType {

    //fields
    SMALL_HEAD("Size doesn`t matter"),
    MIDDLE_HEAD("The truth is in the middle"),
    LARGE_HEAD("The bigger, the better");

    private String message;

    //constructor
    private HeadType(String message){
        this.message = message;
    }

    //getter
    public String getMessage(){
        return this.message;
    }
}
