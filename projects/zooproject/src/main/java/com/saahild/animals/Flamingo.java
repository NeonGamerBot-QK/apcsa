package com.saahild.animals;

import com.saahild.classes.Birds;

public class Flamingo extends Birds {

  public Flamingo() {
    super(true);
  }

  public void descend() {
    System.out.println("Descending");
  }

  public void ascend() {
    System.out.println("Ascending");
    fly();
  }

  @Override
  public String toString() {
    return "Flamingo{}";
  }
}
