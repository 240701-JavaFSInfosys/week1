package com.revature;

/* Differences we've seen between static and nonstatic members

-Static members belong to the class itself, so...
    -They can be accessed without an instance of the class.
    -Nonstatic members cannot be accessed this way, we must make an object before we can access them

-Nonstatic members cannot be access within static methods

  */

public class Launcher {

    public static void main(String[] args) {

        //since int1 and int2 are STATIC, we can call them directly from the class
        //we don't need to instantiate a ScopeTester object, since these variables "belong to the Class"
        System.out.println(ScopeTester.int1);
        System.out.println(ScopeTester.int2);

        //Java doesn't like this. int3 is nonstatic, so we need to make an object to access it.
        //System.out.println(ScopeTester.int3);

        //Instantiate a ScopeTester object
        ScopeTester tester = new ScopeTester();

        //Now, we can access int3!
        System.out.println(tester.int3);

    }

}
