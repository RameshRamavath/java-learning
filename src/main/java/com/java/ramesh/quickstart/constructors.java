package com.java.ramesh.quickstart;

public class constructors {
    // used to initialize the variable in a class

    //our variable - Name
    public String name;
    private int age;

    //constructor - always same as class name -- no return type is required - these are just for initializing variables

     public constructors(String userName, int age){
        this.name=userName;
        this.age=age;

    }

    void infoPrint(){

         System.out.println("User name ::" + name + " and age ::" + age);

    }
}
