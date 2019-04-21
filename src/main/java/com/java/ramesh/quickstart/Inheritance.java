package com.java.ramesh.quickstart;

public class Inheritance extends IntroToOOP {



    // What is Inheritance??

    /*
      Inherit the behaviour of Parent class in our child classes.
      EX: public class Vehicle -- our parent class
          public class car -- our child class [could be] -- now some of the methods/behaviour of Vehicle class can be used/extended in car class.

          this is basically achieved using inheritance.

          public class car extends vehicle () {
             // once we create this class - it will complain about our default constructor -- as names of both default constructors are diff
             // Hence we have inherit parameters passed through parent constructor -- the super keyword in Java comes into picture here.

             public car (String model, String mileage) {

             super(model, mileage)

             }

             // basically all the methods in parent class are visible/available to child class by inheritance
          }

     */

    // lets use human IntroToOOP class [human class] - and assume inheritance as child class now.

    // default constructor won't work here and create inheritance constructor using super keyword.

    public Inheritance(String name, int age, int height, String color, String sex) {
        super(name, age, height, color, sex);
    }


    // now we can create instance of inheritance class and use methods available in introToOOP class.

    // methods in child class won't be available while invoking parent Class.
}
