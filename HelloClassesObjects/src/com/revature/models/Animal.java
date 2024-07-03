package com.revature.models;

//This is a Class meant to MODEL an Animal - think of it as a blueprint for all Animal objects
//This Class defines all the attributes (variables) and behaviors (methods) of a generic Animal
public class Animal extends Object{

    //These are 4 Animal variables - data that describe the Animal

    public String species;
    public int legs;
    public String sound;
    public boolean isMammal;


    //This is a method that lets an Animal move
    public void move(){
        System.out.println(species + " is moving with " + legs + " legs");
    }

    //This is a method that lets an Animal make some kind of noise
    public String makeNoise(){
        return species + " says " + sound;
    }

    /* Method Disambiguation

    The methods below are both public, so they're visible to everything in the application

    The methods have return types
        -move has a void return type so it doesn't return anything
        -makeNoise has a String return type so it returns a String

    These methods don't take any (parameters). So we don't need to give them any extra info
     */



    //Let's see some CONSTRUCTORS - these are what let us make objects based off of classes

    /* When we instantiate (create) an object, we use a constructor to give it initial values
       Constructors share the name of the Class, and have no return type

       These constructors are example of METHOD OVERLOADING
       Overloaded methods have the SAME NAMES but DIFFERENT PARAMETERS (different number OR datatype, or both)

       This is another of POLYMORPHISM - one of the 4 Pillars of OOP
       "same name, different forms"
     */

    //no-args constructor. It takes NO ARGUMENTS. Typically used to give default values to an object
    //If you create a new Animal and give it no parameters this constructor will be called
    public Animal(){
        this.species = "Animal";
        this.legs = 4;
        this.sound = "Hi I'm an Animal";
        this.isMammal = true;
    }

    //all-args constructor. This allows us the flexibility to make an Animal with whatever values we want
    //Whatever 2 arguments are supplied will then be assigned to their appropriate variables
    public Animal(String species, int legs, String sound, boolean isMammal){
        this.species = species;
        this.legs = legs;
        this.sound = sound;
        this.isMammal = isMammal;
    }

}
