package com.saahild.bedroom.components;

import com.saahild.bedroom.util.ShoeDirection;

public class PairOfShoes {

  private Boolean isTidy;
  private final Shoe[] shoes;

  /**
   *
   * @param ptidy should shoes automatically be tidy
   */
  public PairOfShoes(Boolean ptidy) {
    isTidy = ptidy;
    shoes = new Shoe[] {
      new Shoe(ShoeDirection.LEFT),
      new Shoe(ShoeDirection.RIGHT),
    };
  }

  /**
   * Default constructor, not tidy
   */
  public PairOfShoes() {
    isTidy = false;
    shoes = new Shoe[] {
      new Shoe(ShoeDirection.LEFT),
      new Shoe(ShoeDirection.RIGHT),
    };
  }

  /**
   * Tidy shoes
   */
  public void tidyShoes() {
    for (Shoe shoe : shoes) {
      shoe.tidyShoes();
    }
    isTidy = true;
  }

  /**
   * Get all shoes
   * @return
   */
  public Shoe[] getShoes() {
    return shoes;
  }

  /**
   * Untidy shoes
   */
  public void untidyShoes() {
    for (Shoe shoe : shoes) {
      shoe.untidyShoes();
    }
    isTidy = false;
  }

  /**
   * are the shoes tidy
   * @return
   */
  public Boolean isTidy() {
    return isTidy;
  }

  @Override
  public String toString() {
    return (
      "PairOfShoes{" +
      "isTidy=" +
      isTidy +
      ", shoes=" +
      shoes[0].toString() +
      ", " +
      shoes[1].toString() +
      '}'
    );
  }
}
