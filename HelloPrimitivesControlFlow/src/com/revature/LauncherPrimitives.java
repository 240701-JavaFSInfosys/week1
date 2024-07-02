package com.revature;

public class LauncherPrimitives {

    //Generate a main method by typing "main" and then enter
    public static void main(String[] args) {

        //int is the most common integer-type primitive (others are byte and short)
        int i = 500_000; //good manners to use underscores where a comma would be

        //if you ever need a REALLY big number, you can use a long
        long l = 5_000_000_000_000_000_000L;

        //we can chain math operations
        System.out.println(5 + 15 * 20 / 5);

        //we can also use + to "concatenate" values to a String
        System.out.println("My favorite number is: " + 25);

        //booleans are how we convey true/false. The ONLY way to do this in Java
        boolean b = true;
        boolean b2 = false;
        boolean b3 = 3 > 2; //true
        System.out.println(5 < 2);

        //chars are just single characters. They use 'single quotes'
        char c = 'c';
        char c2 = '\u263A'; //chars can be unicode values or literal characters
        System.out.println(c2);

        //double is the most common decimal-type primitive (the other is the less mem-consuming "float")
        double d = 3.14159;

        System.out.println("======================(Arithmetic Operators)");

        //we know how + - * / work

        //the modulus (%) gives us the remainder of a division
        int testNumber1 = 10;
        int testNumber2 = 11;

        //let's use the modulus to determine even/odd
        if(testNumber1 % 2 == 0){
            System.out.println(testNumber1 + " is even");
        }

        if(testNumber2 % 2 == 0){
            //THIS WILL NEVER PRINT! 11/2 gives a remainder of 1. 1 != 0
            System.out.println(testNumber2 + " is even");
        }

        /*increment and decrement operators

        We use ++ to increase a number by 1
        We use -- to decrease a number by 1
        Very useful in loops or any kind of up or down counter

        We can increment/decrement any number type, as well as char (which would change the unicode value)*/

        int funnyNumber = 24;
        System.out.println(funnyNumber);

        funnyNumber++;
        System.out.println("You know what's funnier than 24? " + funnyNumber);

        //++pre vs post++ increment?
        int k = 5;

        System.out.println(k++); //this will print out 5, THEN increment k
        System.out.println(k);

        System.out.println(++k); //this will increment k, THEN print out 7


    }

}
