package com.java.ramesh.quickstart;

import java.util.Scanner;

public class Starter {

    public  static void  main (String args[]){

        /* introToOOP Section */

        /*    IntroToOOP humanObj = new IntroToOOP(); // constrcuted one human object from our Human blueprint (Class)
            // assign some values to our variables
            humanObj.name = "Ramesh";
            humanObj.age = 25;
            System.out.println("Calling HumanObj ::");
            humanObj.Eat(); // asking to perform human characteristics we defined as methods.
            humanObj.work();

            // create another human object -- called Mahesh

            IntroToOOP mahesh; // mahesh is just an instance variable here
            mahesh = new IntroToOOP(); // object is actually created when this statement is executed.

            mahesh.name = "Mahesh";
            mahesh.age = 30;
            mahesh.height=6;
            System.out.println("Calling Mahesh Human ::");
            mahesh.work();
            mahesh.Eat();*/

            // another way to initialize the our variables is - inside our constructor as shown introToOOP class

        // create diff instance variables of human class

       /*     System.out.println("creating HumanObjs with hardcoded varaibles ::");

            IntroToOOP human1 = new IntroToOOP();
            IntroToOOP human2 = new IntroToOOP();
            IntroToOOP human3 = new IntroToOOP();*/

            // note all above humans has same features (variables), but they are not same -- As we fixed variable values inside the Human constructor : we have same output

        // instead of hard coding var values in constructor -- pass them while creating instance variables.
            System.out.println("creating HumanObjs with dynamic constructor ::");

        IntroToOOP human1 = new IntroToOOP("Ramesh",25,6,"black","Male");
        IntroToOOP human2 = new IntroToOOP("Mahesh",25,6,"white","Male");
        IntroToOOP human3 = new IntroToOOP("Raju",25,6,"Fair","Male");
            human1.Speak();
            human2.Speak();
            human3.Speak();




        /* working on variables */

        //call a method from another class --> GetName from variables class
        // create a instance/object of variables class to access getName method

        Variables getUserInfo = new Variables();
        //getvar.GetName("my Name is Ramesh");

        // get user name from user
        // use Java scanner class

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide your name ::");
        String userName = userInput.nextLine(); // use nextLine to make it String
        System.out.println("Please provide your location ::");
        String location = userInput.nextLine();
        System.out.println("Please provide your age ::");
        int age = userInput.nextInt();

        // printing my info

        getUserInfo.getMyDetails(userName,location,age);

        //User input from terminal
        //Ramesh
        //Hyd
        //25
        // output on consol
        // Mr. Ramesh is from :: Hyd and his current age is :: 25

        /* working on constructor */

        Constructors cons = new Constructors("Ramesh",25);
        cons.infoPrint();
        //String cons_output1 = cons.constructors("Ramesh",20);
        //String cons_output2 = cons.constructors("Divz");
        //System.out.println("cons_output1 -->" + cons_output1);
        //System.out.println("cons_output2 -->" + cons_output2);



        /* inheritance section */



        Inheritance men1 = new Inheritance("Poul",30,5,"white","male");

        System.out.println("Calling inherited Class methods");
        men1.Speak(); // note we don't have Speak method in inheritance class.
    }

}
