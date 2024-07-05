package com.revature.exceptions;

/* This Class extends Exception. This makes it a Checked Exception (AKA Compile Time Exception)
   So now, this class has all the basic Functionalities of an Exception (can crash code etc.)
   If we wanted an UNCHECKED Exception, we could have extended Runtime Exception instead.*/
public class NotACookieException extends Exception{

    //The whole point of this constructor is to return a String telling the user what went wrong
    //This is the message that will be printed with the Stack Trace
    public NotACookieException(String message){
        super(message);
    }

}
