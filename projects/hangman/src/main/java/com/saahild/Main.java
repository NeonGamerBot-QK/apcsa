package com.saahild;

public class Main {
    public static void main(String[] args) {
        Hangman hangman = new Hangman("hello");
        System.out.println(hangman);
        hangman.play();
    }
}