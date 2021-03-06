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

public class AsianLuxury extends Car {
    public AsianLuxury() {
        bundle = "Asian Luxury Bundle";
        make = "Honda";
        model = "Accord";
        carSpecs.add("GPS");
        carSpecs.add("Premium Sound System");
        carSpecs.add("Leather Interior");
    }

}
