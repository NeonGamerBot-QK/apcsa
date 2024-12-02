package com.saahild;

import java.util.Arrays;
import java.util.Scanner;

public class Wordle {
    private String word;
    public Wordle(String word) {
        this.word = word;
    }
   private String[] getWordList() {
    return new String[] { "rossa","jetty","wizzo","cuppa","cohoe","gurks","squad","beisa","shrug","fossa","fluyt","camus","speed","mamil","array","polio","barns","panes","souts","limas","fetch","queck","twink"};
   } 
    private String pickRandomWord(String[] list) {
     return list[Math.round((float) (Math.random() * list.length))];
    }
    private String colorLetter(String letter, String color) {
     return color + letter + Reset;
    }
    private String[] evaluateGuess(String guess, String secretWord) {
     String[] words = new String[guess.length()];
     for (int i = 0; i < guess.length(); i++) {
      char letter = guess.charAt(i);
      int lIndex = secretWord.indexOf(letter);
      if (lIndex >= 0) {
       if (lIndex == guess.indexOf(letter)) {
        words[i] = colorLetter(String.valueOf(letter), FgGreen);
       } else {
        words[i] = colorLetter(String.valueOf(letter), FgYellow);
       }
      } else {
       words[i] = colorLetter(String.valueOf(letter), FgGray);
      }
     }
     return words;
    }
    public void playWordle() {
     System.out.println("Starting wordle...");
     String word = pickRandomWord(getWordList());
     if (System.getenv("REVEAL_WORD") != null) {
      System.out.println("Cheater: " + word);
     }
     String[][] board = new String[5][5];
     run(board, word);
    }
    private void run(String[][] board, String word) {
     System.out.println("========================================");
     if (board.length > 0) {
      for (String[] row : board) {
       System.out.println(String.join(" ", row));
      }
     } else {
      System.out.println("<empty board>");
     }
     System.out.println("========================================");
     String input = ""; // Initialize the input variable
    System.out.print("Enter your guess: ");
    Scanner scanner = new Scanner(System.in);
    input = scanner.nextLine().substring(0,5);
    // if (input.length() < 5) {
    //  System.out.println("Invalid input. Please enter a 5 letter word.");
    //  run(board, word);
    // }else {
     String[] guess = evaluateGuess(input, word);
     if (Arrays.toString(guess).equals(word)) {
      System.out.println("You win!");
     } else {
      board[board.length] = guess;
      run(board, word);
     }
    // }
    }
    private static final String FgGreen = "\u001B[32m";
    private static final String FgYellow = "\u001B[33m";
    private static final String FgGray = "\u001B[37m";
    private static final String Reset = "\u001B[0m";
    // public static void main(String[] args) {
    //     new Wordle("Tasco").playWordle();
    // }


}
