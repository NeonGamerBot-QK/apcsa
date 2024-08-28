package com.saahild;

import java.util.Scanner;

public class Main {

  private static String[] getWords() {
    String[] words = {
      "idk",
      "Your cool",
      "You suck",
      "uhhh",
      "Amazing?!",
      "Terrible",
    };
    return words;
  }

  public static void main(String[] args) {
    String[] words = getWords();
    System.out.println("Welcome to 8ball");
    try (Scanner user = new Scanner(System.in)) {
      System.out.println("Do you want to play? (y/n)");
      String shouldIContinue = user.next();
      if ("n".equals(shouldIContinue)) {
        System.out.println("Goodbye");
        user.close();
      } else {
        System.out.println("Whats your question: ");
        String _Question = user.next();
        int selectedInt = Math.round((int) Math.random() * words.length);
        String word = words[selectedInt];
        System.out.println(word);
      }
    }
  }
}
