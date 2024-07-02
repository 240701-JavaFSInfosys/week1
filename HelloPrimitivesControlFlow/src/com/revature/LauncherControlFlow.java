package com.revature;

public class LauncherControlFlow {

    public static void main(String[] args) {

        //using the built-in Math Class to get a random number
        int random = (int)(Math.random() * 100);

        System.out.println(random);

        /*Math.random gives us a positive number between 0-1
        I multiplied by 100 to get number between 0-100
        Then I casted to an int to get a whole number (since Math.random() returns a double)*/

        System.out.println("======================(If/Else)");

        //if the (condition) is true, run the {block}, otherwise move on to the next condition

        if(random > 75){
            System.out.println("random number is pretty big");
        } else if (random > 30){
            System.out.println("random number is medium");
        }
        else {
            System.out.println("random number is pretty small");
        }

        System.out.println("======================(While and Do-While loops)");

        //still using the random number from above

        //while loops---/

        //While the (condition) is true, run the {block}. repeat until the condition is false
        while(random < 200){
            random += 20; //this is the same as saying random = random + 20;
            System.out.println("Random Number is: " + random);
        }

        System.out.println("While loop has broken!");

        //do-while loops---/

        //do-while loops are the same as while loops, except the block will always run at least once
        do {
            random -= 20;
            System.out.println("Random Number is: " + random);
        } while (random > 100);

        System.out.println("Do While loop has broken!");


        System.out.println("======================(For Loops)");

        //basic for loop---/

        /*"for as long as this int i, which starts at 0, is less than 10, increment i by 1, and run the loop"
        so we've basically written a loop that will execute some code 10 times

        DECLARATION: the initial variable we'll use in our loop (int i = 0;)
        CONDITION: the condition that must be true for the loop to run again (i < 10;)
        STATEMENT: the code that will run before each loop (i++;)
        {CODE BLOCK}: the code that will run in each loop iteration*/
        for(int i = 0; i < 10; i++){
            System.out.println("our loop variable is: " + i);
        }

        //more common use case of for loops: moving through a sequence of values---/

        //This is an Array of Strings. In other words, a String Array
        String[] birds = {"duck", "duck", "puffin", "duck", "goose", "duck"};

        //Arrays are INDEXES, so we can retrieve individual values using their indexes
        System.out.println(birds[0]); //Arrays are ZERO INDEXED. The first value is at index 0
        System.out.println(birds[5]); //Last value. NOT 6, despite there being 6 values. it goes 0-5

        System.out.println("-----");
        //I'm going to use a for loop to iterate through the array and only print out "duck"
        //I want to skip "puffin" and I want to break the loop entirely if we hit "goose"

        //As long as i is less than the length of the birds array (6), increment i by and run the loop
        for(int i = 0; i < birds.length; i++){

            //I want to skip the current loop if we hit "puffin"
            if(birds[i].equals("puffin")){
                continue; //continue causes the loop to skip it's current iteration
            }

            //I want to break the loop entirely if we hit "goose"
            if(birds[i].equals("goose")){
                break; //we HATE geese. so we'll use break to stop the loop entirely
            }

            //^This could have been done more elegantly with if -> else-if

            System.out.println(birds[i]);

        }

        //Here's something called an ENHANCED FOR LOOP - often used to easily iterate through sequences
        //"for every bird in the String[] called birds, print out the bird"
        for(String bird : birds){
            System.out.println(bird + " in the enhanced for loop");
        }

        System.out.println("======================(Switch Statements)");

        //

        System.out.println("What is the best Pokemon?");

        //switch statements take in a value and execute some logic if the value matches one of the cases
        switch("blue eyes white dragon"){
            case "pikachu":
                System.out.println("Nope, too basic");
                break; //we need break statements or the following case will also execute (probably don't want that)
            case "charizard":
                System.out.println("Getting warmer");
                break;
            case "mewtwo":
                System.out.println("You didn't play past gen 1");
                break;
            case "mudkip":
                System.out.println("Correct!");
                break;
            default:
                //the default block will run if no other cases match
                System.out.println("Please enter a real or relevant pokemon");
                break;
        }

    }

}
