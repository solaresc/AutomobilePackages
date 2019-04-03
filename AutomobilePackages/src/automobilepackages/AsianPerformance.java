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

public class AsianPerformance extends Car {

    public AsianPerformance() {
        bundle = "Asian Performance Bundle";
        make = "Nissan";
        model = "Civic";
        carSpecs.add("GPS");
        carSpecs.add("Spoiler Kit");
        carSpecs.add("Turbo Boost");

    }
}
