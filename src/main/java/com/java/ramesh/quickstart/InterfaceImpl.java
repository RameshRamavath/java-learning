package com.java.ramesh.quickstart;

public class InterfaceImpl extends IntroToOOP implements Interfaces{


    // create constrctor based on parent class

   public InterfaceImpl (String name, int age, int height, String color, String sex){
       super(name,age,height,color,sex);
   }


    // A class which implements Interface must  use methods in Interface -- It's a contract basically
    // otherwise the compiler will complain

    public void fly() {

    }




}
