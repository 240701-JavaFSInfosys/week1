package com.revature.models;

/* Fish EXTENDS Animal. So what?

 First of all, this is a primary example of INHERITANCE (one of the 4 pillars of OOP)
 This means that the Fish Class has ALL the members of the Animal Class (they were inherited)
 BUT it can also have its own members unique to Fish
 Fish is therefore a CHILD class of Animal AKA Subclass
 */
public class Fish extends Animal{

    //Fish has all the variables and methods of Animal, but let's make a unique variable and unique method for fish

    public String waterType; //not every animal will have this, but every Fish will have this

    //not every animal can splash, but every Fish can
    public void splash(){
        System.out.println("The " + species + " is splashing around in the " + waterType + " water!");
    }

    /*METHOD OVERRIDING - we're taking the original move() method define in Animal, and changing what it does
    This is something that's only done in subclasses. Child Class overrides the Parent Class.

     If we didn't override the move() method, then fish would just have the same original one as Animal
     To override, we declare the SAME METHOD SIGNATURE, with a DIFFERENT METHOD BODY
     This is an example of POLYMORPHISM - one of the pillars of OOP */
    @Override
    public void move(){
        System.out.println(species + " is swimming thanks to the overridden move() method");
    }

    //no-args constructor
    public Fish(){
        super(); //this calls the no-args constructor of the Parent class
        //We gave super() no args to ensure that it calls the no args constructor of the parent class
        this.waterType = "saltwater";
    }

    //all-args constructor
    public Fish(String species, int legs, String sound, boolean isMammal, String waterType){
        super(species, legs, sound, isMammal); //this calls the all-args constructor of the Parent class
        this.waterType = waterType;
    }

}
