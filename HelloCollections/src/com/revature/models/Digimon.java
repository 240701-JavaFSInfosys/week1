package com.revature.models;

public class Digimon {

    //These variables are private for the sake of ENCAPSULATION (one of the 4 pillars of OOP)
    private String name;
    private String type;

    //Let's add a method just for spice
    public void fight(){
        System.out.println(name + " is fighting!");
    }

    //BOILERPLATE CODE--------------------/

    //What is "boilerplate code?"
    //It's any standard block of code that is consistently repeated in multiple places

    //constructors, getters/setters, toString(), equals() and hashCode()

    //no-args constructor
    public Digimon() {
    }

    //all-args constructor
    public Digimon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    //getters and setters

    /* Why use getters and setters?

    Combined with private variables, they allow us to achieve ENCAPSULATION
    In a secure application, you Class's variables will always be private
    In other words, with encapsulation, you cannot ACCESS or CHANGE (get or set) these variables

    You don't want data to be exposed or changed on accident
    you want ONE SPECIFIC WAY to view or change that data. That's where getters and setters come in
    Getters let you access the data, Setters let you change the data. */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //the toString() method allows us to print out the object and its values as a String
    //Now, we won't get hashcodes in our console when we try to print out Digimon
    @Override
    public String toString() {
        return "Digimon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
