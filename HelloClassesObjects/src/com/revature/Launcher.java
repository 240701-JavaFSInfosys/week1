package com.revature;

import com.revature.models.Animal;
import com.revature.models.Fish;

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

        System.out.println("===========================(Using the Fish subclass)");

        Fish f = new Fish(); //no-args fish

        //let's use the splash and move methods of fish - notice it's using the generic "Animal" species value
        f.splash();
        f.move();

        //all-args fish
        Fish f2 = new Fish("Blue Tang", 0, "Just keep swimming", false, "saltwater");

        //now let's call the methods again
        f2.splash();
        f2.move();

        //remember we also have the makeNoise() method from Animal - remember it returns a String
        System.out.println(f2.makeNoise());

        //recall that the splash() method is unique to Fish. So we can't call it from Animal
        //a3.splash();

    }

}
