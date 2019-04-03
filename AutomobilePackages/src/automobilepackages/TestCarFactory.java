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

public class TestCarFactory {


    public static void main(String[] args) {

        CarFactory NorthAmericanBundle = new NorthAmerica();

        Car carBundle = NorthAmericanBundle.createBundle("luxury");
        System.out.println("\n" + NorthAmericanBundle.orderBundle("luxury") + "\n");

        Car carBundle2 = NorthAmericanBundle.createBundle("performance");
        System.out.println("\n" + NorthAmericanBundle.orderBundle("performance") + "\n");

        System.out.println("********************************************");

        CarFactory EuropeanBundle = new Europe();

        Car carBundle3 = EuropeanBundle.createBundle("luxury");
        System.out.println("\n" + EuropeanBundle.orderBundle("luxury") + "\n");

        Car carBundle4 = EuropeanBundle.createBundle("performance");
        System.out.println("\n" + EuropeanBundle.orderBundle("performance") + "\n");

        System.out.println("********************************************");


        CarFactory AsianBundle = new Asia();

        Car carBundle5 = AsianBundle.createBundle("luxury");
        System.out.println("\n" + AsianBundle.orderBundle("luxury") + "\n");

        Car carBundle6 = AsianBundle.createBundle("performance");
        System.out.println("\n" + AsianBundle.orderBundle("performance") + "\n");

    }

}