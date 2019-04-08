package com.java.ramesh.quickstart;

import javax.print.DocFlavor;
import java.util.Scanner;

public class stater {

    public  static void  main (String args[]){

        //call a method from another class --> GetName from variables class
        // create a instance/object of variables class to access getName method

        variables getUserInfo = new variables();
        //getvar.GetName("my Name is Ramesh");

        // get user name from user
        // use Java scanner class

        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine(); // use nextLine to make it String
        String location = userInput.nextLine();
        int age = userInput.nextInt();

        // printing my info

        getUserInfo.getMyDetails(userName,location,age);

        //User input from terminal
        //Ramesh
        //Hyd
        //25
        // output
        // Mr. Ramesh is from :: Hyd and his current age is :: 25

        // using constructor

        constructors cons = new constructors("Ramesh",25);
        cons.infoPrint();
        //String cons_output1 = cons.constructors("Ramesh",20);
        //String cons_output2 = cons.constructors("Divz");
        //System.out.println("cons_output1 -->" + cons_output1);
        //System.out.println("cons_output2 -->" + cons_output2);


    }

}
