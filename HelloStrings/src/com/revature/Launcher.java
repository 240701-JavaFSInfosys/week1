package com.revature;

public class Launcher {

    public static void main(String[] args){

        System.out.println("=============(String Immutability)");

        //Strings are immutable, we can't change a String once we define it
        String s = "I AM IMMUTABLE";

        //toLowerCase() returns a new String, in all lowercase - doesn't change the OG String
        s.toLowerCase(); //the operation IS happening, but we're not saving/printing it
        System.out.println(s);

        //let's print out the s.toLowerCase() just to prove it's working
        System.out.println(s.toLowerCase());

        //if we need to SAVE these manipulations, we can reassign s or make a new variable
        String s2 = s.toLowerCase();

        System.out.println("Old String: " + s);
        System.out.println("New String: " + s2);

        //BUT BEN... if we change the value of s, isn't that changing the String? Not quite

        s = "s now holds a different String";

        //despite s holding a new String now...
        //the original value still exists, unchanged, in memory.

        System.out.println("===================(String Equality - Comparing Strings)");

        //we can compare primitives with ==, but not objects
        int i = 5;
        //System.out.println(i == 5); //prints true

        //Strings are objects, and objects must be compared with .equals()
        String st = "Hello Java"; //This is a String literal (no "new" keyword)
        String st2 = "Hello Java"; //This is another String literal with the same value

        //These two String are technically the same object in memory, since we made them as String literals

        //by using the new keyword, we will ALWAYS createa new object in memory
        String st3 = new String("Hello Java");

        System.out.println(st == st2); //true - but not why you might think. It's comparing MEMORY ADDRESS
        System.out.println(st == st3); //false - different memory addresses

        //THIS is exactly why we must use .equals() for objects - to compare VALUE not MEMORY ADDRESS
        System.out.println(st.equals(st3));

    }

}
