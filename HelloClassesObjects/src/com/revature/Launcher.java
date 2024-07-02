package com.revature;

import com.revature.models.Animal;

public class Launcher {

    public static void main(String[] args) {

        //Instantiate an Animal object with the no-args constructor
        //This will give us a generic Animal with generic values
        Animal a = new Animal();

        //let's use some Animal variables
        System.out.println("Our Animal is an " + a.species);
        System.out.println("Our Animal has " + a.legs + " legs");

        //let's invoke the 2 Animal methods
        a.move();
        System.out.println(a.makeNoise());
        //makeNoise() returns a String, so we need to print it out to see the returned value


        //OK, now let's instantiate 2 Animal objects with the all-args constructor
        Animal a2 = new Animal("Capybara", 4, "Ugugugugu", true);
        Animal a3 = new Animal("Snake", 0, "Hiss", false);

        //use some methods just for fun
        a2.move();
        System.out.println(a2.makeNoise());

        a3.move();
        System.out.println(a3.makeNoise());

    }

}
