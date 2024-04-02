package org.launchcode;

import java.util.Scanner;
public class Gas {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter gas consumed in gallons: ");
        double gals = input.nextDouble();
        double mpg = miles/gals;
        System.out.println("Your mpg is " + mpg);
    }
}
