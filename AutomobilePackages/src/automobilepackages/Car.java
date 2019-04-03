/***************************************************************
******
 Author : Caleb Solares
 Course : COP4814
 Professor : Caryl Rahn
 Program : Lab 7
 Purpose : To design and code a software component that assembles the 
 content of two auto packages ("Luxury Bundle" and "Performance Bundle") 
 for three geographic regions (Europe, Asia, North America), relating to 
 two models of cars sold by a single manufacturer.
 Due Date : 11/18/2018
 Certification:
 I hereby certify that this work is my own and none of it is the work of any other person.
 ..........{ Caleb Solares }..........
****************************************************************
*****/

import java.util.ArrayList;


public abstract class Car {

    String bundle;
    String make;
    String model;

    ArrayList carSpecs = new ArrayList();

    public String getName() {
        return bundle;
    }


    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + bundle + " ----\n");
        display.append("Make: " + make + "\n");
        display.append("Model: " + model + "\n");
        for (int i = 0; i < carSpecs.size(); i++) {
            display.append("Features: " + (String) carSpecs.get(i) + "\n");
        }
        return display.toString();
    }


}