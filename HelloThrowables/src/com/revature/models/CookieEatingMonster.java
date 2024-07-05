package com.revature.models;

import com.revature.exceptions.NotACookieException;

//This Class will model a monster that only eats cookies. A cookie monster if you will
//It has two methods that will take in a Food object and throw an exception is it's not a cookie
public class CookieEatingMonster {

    public void eatCookieWithTryCatch(Food food){
        try{
            if(food.isCookie){
                System.out.println("I'm eating a cookie nom nom nom");
            } else {
                //"throw" is the keyword used to throw a new Exception
                throw new NotACookieException("I only eat cookies D:<");
            }
        } catch(NotACookieException e){
            System.out.println("I caught a NotACookieException");
            e.printStackTrace();
        }
    }

    //This method THROWS NotACookieException, which makes it not responsible for handling the Exception
    //If the Exception gets thrown here, it will be the responsibility of the method that called it
    public void eatCookieWithThrows(Food food) throws NotACookieException{

        if(food.isCookie){
            System.out.println("Eating a cookie from the eatCookieWithThrows method. yum.");
        } else {
            throw new NotACookieException("Do not feed me anything other than cookies.");
        }

    }

}
