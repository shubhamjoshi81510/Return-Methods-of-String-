package com.practice.Retrun.values.Exception;

import org.apache.coyote.BadRequestException;

public class NotFoundException extends RuntimeException{

    public NotFoundException (String message){
        super(message);
    }

    public class BadRequestException extends RuntimeException{
       public BadRequestException (String message){
           super(message);
       }
    }
}
