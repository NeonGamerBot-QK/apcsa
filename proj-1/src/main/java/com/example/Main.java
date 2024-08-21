package com.example;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner user = new Scanner(System.in)) {
            // print 
            System.out.println("Whats is your first name!");
            String fullname = user.next();
            System.out.println("Hello " + fullname);
            System.out.println("What year were you born?");
            int birthYear = user.nextInt();
            System.out.println("Awseome so you are " + (Year.now().getValue() - birthYear) + " Years old");
            System.out.println("Enter int > 1000");
            int greaterThen1000 = user.nextInt();
            int everythingButTheOnesDigit = greaterThen1000 / 10;
            String everythingButTheOnesDigitStr = "" +everythingButTheOnesDigit;
            System.out.println("The ones digit is of "+greaterThen1000 + " is " + everythingButTheOnesDigit);
            System.out.println("If you remove the ones digit, you get "+ ("" + greaterThen1000).replace(everythingButTheOnesDigitStr, ""));
            System.out.println("Enter a double");
            double decimal = user.nextDouble();
            int decInt = (int) decimal;
            System.out.println("The truncated version of " + decimal + " is " + decInt);
        }
    }
}