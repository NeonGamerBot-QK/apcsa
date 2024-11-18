package com.saahild;

import java.util.Scanner;

public class Hangman 
{ 
   // the secret word 
  private String word; 
  
 // a string that shows which letters in word have and have not been guessed yet 
 private String hint; 
  
 // how many guesses the player has left 
 private int numGuessesLeft; 
  
 /** Creates a hangman object
  * @param word secret word to be guessed
  */
 public Hangman(String word)
{ 
    this.word = word;
    numGuessesLeft = 6;
    this.initHint();
 }  

 /** Initialize the hint instance variable so that it contains a “?” for each letter in word. If word is "hello" then hint should be "?????" 
  */ 
 private void initHint() 
 {
    String r = "";
for(int i = 0; i < this.word.length(); i++) {
    r += "?";
}
this.hint = r;
  } 
  
 /** Checks if word contains letter. If it does, return true;  otherwise, decrement numGuessesLeft by 1 and return false. 
     * @param letter the letter the use is guessing
     * Precondition: letter contains exactly 1 character 
     */ 
  @SuppressWarnings("IndexOfReplaceableByContains")
 private boolean checkGuess(String letter) 
 {
    return this.word.indexOf(letter) != -1;
  }  
  
 /** Replace each ? in hint with letter at each index that letter exists in word. 
     * For example, if word is "tomato" then updateHint("o") would change hint to be "?o???o"
  * @parm letter the letter to be placed in the hint 
  * Precondition: letter contains exactly 1 character. 
      */ 
 private void updateHint(String letter) 
 { 
    String r = "";
    for(int i = 0; i < this.word.length(); i++) {
        // r += "?";
        if(this.word.charAt(i) == letter.charAt(0)) {
            System.out.println("ITS F CORRECT");
            r += letter;
        } else {
            r += this.hint.charAt(i);
        }
    }
    this.hint = r;
 } 
  
 /** Return true if all the letters of word have been guessed correctly or if there are no more guesses left; otherwise, return false. 
     *  @return returns boolean 
     */ 
 private boolean isGameOver() 
 { 
    return this.hint.equals(this.word) || this.numGuessesLeft == 0;
 } 
  
 /** Ask the user to guess a letter until the game ends. After the game ends, tell the user if they won or lost. 
     */ 
 public void play()  
 { 
    Scanner scanner = new Scanner(System.in);
    
    while(!this.isGameOver()) {
        System.err.println("Word: " + this.hint);
        System.out.println("Remaing guesses: " + this.numGuessesLeft);
        System.out.println("Guess a letter: ");
        String guess = scanner.next();
        if(this.checkGuess(guess)) {
            this.updateHint(guess);
            System.out.println("Correct!");
        } else {
            this.numGuessesLeft--;
            System.out.println("Incorrect!");
        }
    }
} 
}
