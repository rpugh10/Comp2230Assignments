package com.ch15lists;

public class EmptyCollectionException extends RuntimeException{

    public EmptyCollectionException(String collection){
        super("The collection " + collection + " is empty");
    }
}
