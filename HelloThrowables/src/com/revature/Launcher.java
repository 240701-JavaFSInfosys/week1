package com.revature;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("=======(Throwing some Runtime Exceptions, AKA Unchecked Exceptions)");

        //NOTE: We won't usually throw Runtime Exception on purpose. This is for science.

        System.out.println("Trying to divide by Zero");

        //System.out.println(30/0);
        //Our Java code will still compile, but it will throw an ArithmeticException at RUNTIME (runtime exception)

        System.out.println("Trying to access an array index that's out of bounds");

        int[] arr = {1, 2, 3}; //this array has indexes 0-2

        //System.out.println(arr[3]);
        //Index 3 doesn't exist! ArrayIndexOutOfBoundsException

        System.out.println("============(Exception Handling)");

        /* One way to handle Exceptions is to use a try-catch block
         -First, we TRY to execute some code that may throw an exception
         -Next, we have one or more CATCH blocks that will handle whatever exception is thrown
         We can also have a FINALLY block, that runs at the end no matter what */

        try{
            System.out.println("Try block starting...");
            int x = 5/0; //an Exception will get thrown here!
            System.out.println("Will I run? NO - once an exception is thrown, the try block immediately stops running");
        } catch(NullPointerException e){
            System.out.println("I caught a NullPointerException!");
        } catch(ArithmeticException e){
            System.out.println("I caught an ArithmeticException!");
            e.printStackTrace(); //this lets us print more details about what exactly went wrong
        } catch(Exception e){
            System.out.println("I could have caught any kind of Exception... But I wasn't needed");
        } finally{
            System.out.println("Finally block running... I will always run at the end of a try/catch no matter what");
        }

    }

}
