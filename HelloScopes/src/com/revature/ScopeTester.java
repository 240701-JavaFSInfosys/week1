package com.revature;

public class ScopeTester {

    //This is a Class scoped primitive variable. Note "static"
    //It's initialized with the value 10.
    public static int int1 = 10;

    //This is another Class scoped primitive, but it's uninitialized.
    public static int int2;

    //This is an Instance scoped variable. Note the lack of the "static" keyword
    public int int3 = 5;

}
