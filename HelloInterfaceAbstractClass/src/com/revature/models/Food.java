package com.revature.models;

/* This is an INTERFACE, which can contain variables ABSTRACT methods
   Interfaces are meant to be IMPLEMENTED by Classes, which give functionality to the abstract methods
   The reason Interfaces are called "contracts" is because any subclass MUST implement the abstract methods

   Interfaces are great for organization. Imagine 500 methods.
   would you rather refer to abstract ones, or have to scroll through 500 concrete ones?*/
public interface Food {

    //Abstract Method - no method body (not implemented). public and abstract by default
    void getEaten();

    //Interfaces won't allow us to have concrete methods
//    void rot(){
//        System.out.println("This food is rotting");
//    }

    /* Every Food should be able to get eaten. However, not every food will be eaten the same.
     The role of an Interface is to lay out IDEAS of behaviors, but not how to perform those behaviors
     "how to perform" is the job of any Class that decides to implement the Interface */

}
