package com.revature.models;

/* This is an Abstract Class, note the "abstract" non-access modifier. It implements the Food Interface
So now, this abstract class also has access to everything in Food (just the one method)

 Abstract Classes are Classes with AT LEAST one abstract method.
 They can have concrete methods as well.

 Why use an Abstract Class over an Interface?
 -If you KNOW you have certain methods that will be the same across all subclasses, then implement them!
 -The child classes will share the same functionality for that method (can still override of course)
 -I usually just use Interfaces though... */
public abstract class Sandwich implements Food{

    //Variables that all sandwiches have
    public String breadType;
    public int slices;

    //abstract method - a lot of sandwiches can be made different ways. So we'll leave this abstract
    public abstract void beAssembled();

    //concrete method - all sandwiches will produce crumbs the same way
    public void produceCrumbs(){
        System.out.println("Sandwich is producing crumbs");
    }

    //I could have @Overridden the getEaten method, but I'm not forced since this is an abstract class
    //We will have to do it in any concrete subclass that extends Sandwich

    //constructor--/ NOTE we can't instantiate abstract classes, but child classes will inherit this
    public Sandwich(String breadType, int slices) {
        this.breadType = breadType;
        this.slices = slices;
    }

    //We don't NEED constructors in abstract classes, but it's good to have them for any variables
}
