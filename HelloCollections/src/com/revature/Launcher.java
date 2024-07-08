package com.revature;

import com.revature.models.Digimon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("=================(Lists)");

        //ArrayLists are a very commonly used implementation of the List Interface
        //QC once asked me the different between Arrays and ArrayLists. You should know this as well

        //ArrayList of Digimon objects
        ArrayList<Digimon> digimonList = new ArrayList<Digimon>();

        //add some Digimon to the ArrayList with the .add() method.
        digimonList.add(new Digimon("Agumon", "Reptile"));
        digimonList.add(new Digimon("Angemon", "Angel"));
        digimonList.add(new Digimon("Calumon", "Holy Beast"));
        digimonList.add(new Digimon("Herissmon", "Data"));
        digimonList.add(new Digimon("Gabumon", "Reptile"));

        //enhanced for loop to print these out
        for(Digimon d : digimonList){
            System.out.println(d);
        }

        //we can get a certain element from a List with .get()
        System.out.println("Getting a digimon: " + digimonList.get(2));

        //we can set a certain value to something else with .set()
        digimonList.set(3, null); //Lists can have null values

        //we can get an int representing the size of a List with .size()
        System.out.println("I have " + digimonList.size() + " Digimon");

        //we can do some operation per List element with .forEach()
        digimonList.forEach(digimon -> {
            if(digimon != null) { //null check to avoid NullPointerExceptions
                digimon.fight();
            }
        });

        System.out.println("======================(Sets)");

        //Instantiate a new HashSet (which is like a general-use Set)
        HashSet<Digimon> digimonSet = new HashSet<Digimon>();

        digimonSet.add(new Digimon("Agumon", "Reptile"));
        digimonSet.add(new Digimon("Angemon", "Angel"));
        digimonSet.add(new Digimon("Calumon", "Holy Beast"));
        digimonSet.add(new Digimon("Herissmon", "Data"));
        digimonSet.add(new Digimon("Gabumon", "Reptile"));

        //digimonSet.get();
        //Sets have no index, so there's no .get() method

        //Sets do not allow duplicates... So why does this get inserted?? They're different objects in memory
        digimonSet.add(new Digimon("Gabumon", "Reptile"));
        //Let's try it with the same object in memory
        Digimon mewtwo = new Digimon("Mewtwo", "Psychic");
        digimonSet.add(mewtwo);
        digimonSet.add(mewtwo); //we can still invoke .add(), but it won't add this duplicate object

        for(Digimon d : digimonSet){
            System.out.println(d);
        }

        //Sets do have a method called .contains() which returns true if the object is in the Set
        if(digimonSet.contains(mewtwo)){
            System.out.println("Mewtwo is in the Set!");
        }

        System.out.println("======================(Queues)");

        //Instantiate a LinkedList - This is a Class that implements Queue AND List
        LinkedList<Digimon> digimonQueue = new LinkedList<Digimon>();

        digimonQueue.add(new Digimon("Agumon", "Reptile"));
        digimonQueue.add(new Digimon("Angemon", "Angel"));
        digimonQueue.add(new Digimon("Calumon", "Holy Beast"));
        digimonQueue.add(new Digimon("Herissmon", "Data"));
        digimonQueue.add(new Digimon("Gabumon", "Reptile"));

        //.peek() lets us access the first value
        System.out.println("The first digimon in line is: " + digimonQueue.peek());

        //.poll() accesses the first value, then removes it from the Queue
        System.out.println("The first digimon in line is: " + digimonQueue.poll() + "... goodbye!");

        //Let's use .peek() again to prove the first element is gone
        System.out.println("The next digimon in line is: " + digimonQueue.peek());

        System.out.println("======================(Maps - NOT technically Collections)");

        //Instantiate a HashMap to store Digimon owners - we'll Integers for keys, and String for values
        HashMap<Integer, String> owners = new HashMap();



        //we can use put() to specify key value pairs
        owners.put(1, "Taichi");
        owners.put(2, "Ash");
        owners.put(2, "Yugi"); //this will overwrite the previous value for key 2

        System.out.println(owners);

        /* Why are we using Integer instead of int?

           Integer is a WRAPPER CLASS for int. Maps (and Collections) only take objects. No primitives
           So we use Integer instead of int to store our keys in a Map
           Wrapper Classes are CLASS-BASED REPRESENTATIONS of primitives */

    }

}
