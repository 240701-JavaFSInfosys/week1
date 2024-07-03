package com.revature;

import com.revature.models.Food;
import com.revature.models.PhillyCheeseSteak;
import com.revature.models.Sandwich;

public class Launcher {

    public static void main(String[] args) {

        /*Remember, we can't instantiate Interfaces or Abstract Classes
        Food f = new Food();
        Sandwich s = new Sandwich();

        "XYZ is abstract; cannot be instantiated"*/

        PhillyCheeseSteak pcs = new PhillyCheeseSteak("Hoagie", 2);

        //call some methods
        pcs.beAssembled();
        pcs.getEaten();
        pcs.produceCrumbs();

        //call some variables
        System.out.println(pcs.breadType);
        System.out.println(pcs.slices);

    }

}
