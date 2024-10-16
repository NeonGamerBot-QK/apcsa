package com.saahild.bedroom.components;

import com.saahild.bedroom.util.ShoeDirection;

public class PairOfShoes {

  private Boolean isTidy;
  private Shoe[] shoes;

  public PairOfShoes(Boolean ptidy) {
    isTidy = ptidy;
    shoes = new Shoe[] {
      new Shoe(ShoeDirection.LEFT),
      new Shoe(ShoeDirection.RIGHT),
    };
  }

  public void tidyShoes() {
    for (Shoe shoe : shoes) {
      shoe.tidyShoes();
    }
    isTidy = true;
  }
 public Shoe[] getShoes() {
    return shoes;
  }
  public void untidyShoes() {
    for (Shoe shoe : shoes) {
      shoe.untidyShoes();
    }
    isTidy = false;
  }

  public Boolean isTidy() {
    return isTidy;
  }

  public PairOfShoes() {
    isTidy = false;
    shoes = new Shoe[] {
      new Shoe(ShoeDirection.LEFT),
      new Shoe(ShoeDirection.RIGHT),
    };
  }
}
