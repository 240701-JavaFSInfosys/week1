package com.revature.models;

/*
 PhillyCheeseSteak extends Sandwich. Sandwich Implements Food. So PCS has everything from Sandwich and Food
 in other words, it has INHERITED all the members from Sandwich and Food

 Since PCS is a concrete class, it MUST implement the 2 abstract methods it has inherited. */
public class PhillyCheeseSteak extends Sandwich{

    //This method was inherited from Food
    @Override
    public void getEaten() {
        System.out.println("Philly Cheese Steak is getting eaten - there's grease everywhere");
    }

    //This method was inherited from Sandwich
    @Override
    public void beAssembled() {
        System.out.println("Meat and Cheese are being thrown between pieces of bread");
    }

    //Notice how we didn't need to Override the produceCrumbs() method. It's already implemented
    //We could have overridden it, but we aren't forced to.

    //constructor---/

    //this all-args constructor calls to the Constructor found in Sandwich
    public PhillyCheeseSteak(String breadType, int slices) {
        super(breadType, slices); //this calls to the parent constructor
    }

}