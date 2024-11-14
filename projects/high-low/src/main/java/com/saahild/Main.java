package com.saahild;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int selectedInt = (int) Math.round(Math.random() * 100);
    int guess = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess a number between 1 and 100");

    while (guess != selectedInt) {
      // System.out.println("Enter a number between 1 and 100");
      guess = scanner.nextInt();
      if (guess < selectedInt) {
        System.out.println("Higher, enter new number");
      } else if (guess > selectedInt) {
        System.out.println("Lower, enter new number");
      } else {
        System.out.println("You got it!");
      }
    }
  }
}
