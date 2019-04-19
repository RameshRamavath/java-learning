package com.java.ramesh.quickstart;

import javax.print.DocFlavor;
import java.util.Scanner;

public class starter {

    public  static void  main (String args[]){

        /* introToOOP Section */

        /*    intoToOOP humanObj = new intoToOOP(); // constrcuted one human object from our Human blueprint (Class)
            // assign some values to our variables
            humanObj.name = "Ramesh";
            humanObj.age = 25;
            System.out.println("Calling HumanObj ::");
            humanObj.Eat(); // asking to perform human characteristics we defined as methods.
            humanObj.work();

            // create another human object -- called Mahesh

            intoToOOP mahesh; // mahesh is just an instance variable here
            mahesh = new intoToOOP(); // object is actually created when this statement is executed.

            mahesh.name = "Mahesh";
            mahesh.age = 30;
            mahesh.height=6;
            System.out.println("Calling Mahesh Human ::");
            mahesh.work();
            mahesh.Eat();*/

            // another way to initialize the our variables is - inside our constructor as shown introToOOP class

        // create diff instance variables of human class

       /*     System.out.println("creating HumanObjs with hardcoded varaibles ::");

            intoToOOP human1 = new intoToOOP();
            intoToOOP human2 = new intoToOOP();
            intoToOOP human3 = new intoToOOP();*/

            // note all above humans has same features (variables), but they are not same -- As we fixed variable values inside the Human constructor : we have same output

        // instead of hard coding var values in constructor -- pass them while creating instance variables.
            System.out.println("creating HumanObjs with dynamic constructor ::");

        introToOOP human1 = new introToOOP("Ramesh",25,6,"black","Male");
        introToOOP human2 = new introToOOP("Mahesh",25,6,"white","Male");
        introToOOP human3 = new introToOOP("Raju",25,6,"Fair","Male");
            human1.Speak();
            human2.Speak();
            human3.Speak();




        /* working on variables */

        //call a method from another class --> GetName from variables class
        // create a instance/object of variables class to access getName method

        variables getUserInfo = new variables();
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

        constructors cons = new constructors("Ramesh",25);
        cons.infoPrint();
        //String cons_output1 = cons.constructors("Ramesh",20);
        //String cons_output2 = cons.constructors("Divz");
        //System.out.println("cons_output1 -->" + cons_output1);
        //System.out.println("cons_output2 -->" + cons_output2);


    }

}
