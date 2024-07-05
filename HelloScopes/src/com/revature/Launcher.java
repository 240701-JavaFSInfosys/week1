package com.revature;

/* Differences we've seen between static and nonstatic members

-Static members belong to the class itself, so...
    -They can be accessed without an instance of the class.
    -Nonstatic members cannot be accessed this way, we must make an object before we can access them

-Nonstatic members cannot be accessed within static methods

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

        System.out.println("==================(Manipulating ScopeTester's Variables)");

        //instantiate a second ScopeTester object to demonstrate static/nonstatic behaviors
        ScopeTester tester2 = new ScopeTester();

        //above, we printed out int 1-3 from tester. Now let's print them out from tester2
        System.out.println(tester2.int1);
        System.out.println(tester2.int2);
        System.out.println(tester2.int3);

        //let's change these in tester2
        tester2.int1 = 100;
        tester2.int2 = 200;
        tester2.int3 = 300;

        //let's print out the variables from both tester and tester2
        System.out.println("Tester 1: " + tester.int1);
        System.out.println("Tester 2: " + tester2.int1);
        //Since int1 is static, when we change it in one object, it changes for every object

        //same story, int2 is static
        System.out.println("Tester 1: " + tester.int2);
        System.out.println("Tester 2: " + tester2.int2);

        //int3 is nonstatic, so its value is unique to each object
        System.out.println("Tester 1: " + tester.int3);
        System.out.println("Tester 2: " + tester2.int3);

        //for every static variable, the most recent value will be shared amongst every object.
        //for non-static variables, only the object whose value you changed will change.

        System.out.println("====================(Method/Block Scope)");

        methodScopeExample(50);

        //Not typically advised to make an object of a Class within that same Class
        //But this would be the only way to get this method to run if we kept it non-static
        Launcher launcher = new Launcher();
        launcher.methodThatWontRunInMain();

    }

    public static void methodScopeExample(int x){

        //this variable is METHOD SCOPED. only visible within its method
        int methodScopedVariable = 10;

        //parameters are also method scoped
        System.out.println("The parameter " + x + " is method scoped!");

        if(true){
            //this variable is BLOCK SCOPED. only visible within its block
            int blockScopedVariable = 20;

            //we can access both of these variables here, since they're defined within this scope
            System.out.println(methodScopedVariable);
            System.out.println(blockScopedVariable);
        }

        //Java won't like this - we're trying to access this variable outside the scope it was defined in
        //System.out.println(blockScopedVariable);

    }

    public void methodThatWontRunInMain(){
        System.out.println("Hi I'm nonstatic, I won't be able to run in main UNLESS we made a Launcher object");
    }

}
