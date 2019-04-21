package com.java.ramesh.quickstart;

public class IntroToOOP {

    // Objects

    /*

    Objects do the all real-work. like Car is an object and we can create how an car accelerates from one place to another
    We are all Human beings and we all carry out certain behaviour and Software objects perform those intended activities.
    in software world we crate similar objects in JAVA


    --> Create a Class, inside which creates these software objects to perform activities (How should object behave is written inside the class). A blueprint how a objects should
        perform in our application

     */

    // lets assume our class name is HumanBeing
    // let's define few char's which an human can have
    String name;
    int age;
    int height;
    String color;
    String sex;

    // now every object inside our imaginary HumanBeing class will have these features (variables)

    // we can create methods which defines some basic activities an Human can do

    // a human is object here

    // our class is blueprint of what an human can do (written in diff methods)

    // our constructor method (imaginary human constructor)

    /*public IntroToOOP(){

        age = 25;
        name = "Ramesh";
        height = 6;

    }*/

    // creating dynamic constructor -- passing our variable values while calling our constructor method.

    public IntroToOOP(String name, int age, int height, String color, String sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.color = color;
        this.sex = sex;
    }


    // human can speak

    public void Speak(){
        System.out.println("Hello, I am Mr. " + name);
    }

    public  void Eat(){
        System.out.println("I am walking");

    }

    public  void work(){
        System.out.println("I am eating");
    }

    // so All human objects in our application can show case these 3 char's
    // so at present human's will have only three functions they can perform (as only three methods are defined)
    // now with this class you can create constructor method to create human Objects in our main method
    // (ClassName <objName> =  new ClassName())
    // we can invoke the Speak, eat etc methods on objName.


}
