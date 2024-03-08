package com.classwork.lesson10;

public class CustomExcption extends ArrayIndexOutOfBoundsException{
    public CustomExcption(String errorMessage) {
        super(errorMessage);
    }

}
