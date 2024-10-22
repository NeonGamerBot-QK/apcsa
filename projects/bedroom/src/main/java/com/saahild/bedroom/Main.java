package com.saahild.bedroom;

public class Main {

  public static void main(String[] args) {
    Bedroom mybedroom = new Bedroom();
    System.out.print(mybedroom.toString());
    //tidy shoes
    mybedroom.shoes.tidyShoes();
    System.out.print(mybedroom.toString());
    //untidy shoes
    mybedroom.shoes.untidyShoes();
    System.out.print(mybedroom.toString());
  }
}
