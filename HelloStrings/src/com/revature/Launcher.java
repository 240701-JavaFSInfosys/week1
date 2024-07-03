package com.revature;

import org.w3c.dom.ls.LSOutput;

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

        //by using the new keyword, we will ALWAYS create a new object in memory
        String st3 = new String("Hello Java");

        System.out.println(st == st2); //true - but not why you might think. It's comparing MEMORY ADDRESS
        System.out.println(st == st3); //false - different memory addresses

        //THIS is exactly why we must use .equals() for objects - to compare VALUE not MEMORY ADDRESS
        System.out.println(st.equals(st3));

        //and yes, even non string-pool strings are immutable
        st3.toUpperCase();
        System.out.println("st3: " + st3);

        System.out.println("======================(String Methods)");

        //a pangram to use some String methods on\
        String pangram = "The five boxing wizards jump quickly.";

        //we can use the .length() method to return an int representing the length of the String
        System.out.println("The pangram is: " + pangram.length() + " chars long");

        //.subString() returns a new String found in the original String
        System.out.println(pangram.substring(10)); //print out the pangram from index 10 and on
        System.out.println(pangram.substring(10, 35)); //print out the pangram from index 10 to 35

        //we can also use .contains to see if a String contains a certain substring
        if(pangram.contains("wizard")){
            System.out.println("The pangram has something to do with Wizards probably");
        }

        //we can use .split() to create an Array of Strings based on a certain delimiter
        String[] words = pangram.split(" "); //every space in the pangram will indicate a unique String in the Array

        //let's print out the Array using an enhanced for loop
        System.out.println(words);

        for(String word : words){
            System.out.println(word);
        }

        //.chatAt returns the character in a String at whatever index we ask for
        System.out.println(pangram.charAt(5)); //prints 'v'

        //"The five boxing wizards jump quickly."

        //a common use of charAt is reversing a String
        String reversed = "";
        for(int j = pangram.length() - 1; j >= 0; j--){
            reversed += pangram.charAt(j);
        }
        System.out.println(reversed);

        //we can use .startsWith() and .endsWith() to check if a String starts or ends with a certain substring
        System.out.println(pangram.startsWith("T"));
        System.out.println(pangram.startsWith("The"));
        //both true!

        System.out.println("============(Quick example of StringBuilder)");

        //"The five boxing wizards jump quickly."

        //StringBuilder is a Class meant to emulate a String that is MUTABLE (can be change)
        StringBuilder sb = new StringBuilder("I'm a StringBuilder");

        //.reverse() lets us reverse the characters super easily
        sb.reverse();

        //.append() lets us add to the end of the StringBuilder
        sb.append("(I WAS ADDED AFTER THE FACT!!!)");

        //.replace() lets us replace a substring with another substring
        sb.replace(4, 10, "(I HAVE BEEN REPLACED)");

        //we could have also chained these, I find it messy
        //sb.reverse().append("(I WAS ADDED AFTER THE FACT!!!)").replace(4, 10, "(I HAVE BEEN REPLACED)");

        //print it out to see the modifications
        System.out.println(sb);

    }


}
