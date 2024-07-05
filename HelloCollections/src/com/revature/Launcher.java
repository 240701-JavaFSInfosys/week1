package com.revature;

import com.revature.models.Digimon;

import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) {

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

        System.out.println(digimonList);

    }

}
