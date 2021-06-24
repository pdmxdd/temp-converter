package com.company; // package declaration (this helps us organize our code and is our way of combatting namespace issues

import java.util.Scanner; // the import statement for the Scanner tool we used to read user input

public class Main {

    public static void main(String[] args) {
	    double fahrenheit;
	    double celsius;
        Scanner input = new Scanner(System.in); // my guess is the book will be having us do this quite a bit until we get further in the chapter -- take note of it like you did with readline-sync

        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in Celsius is: " + celsius + "C");
//        little bonus extra:
//        System.out.println(new String().format("The temperature in Celsius is: %.2fC", celsius));
    }
}
