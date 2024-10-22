package com.saahild.bedroom.components;

import com.saahild.bedroom.util.ShoeDirection;

public class Shoe {

  private Boolean isTidy;
  public ShoeDirection direction;

  /**
   * shoe constructor
   * @param dir
   */
  public Shoe(ShoeDirection dir) {
    direction = dir;
  }

  /**
   * tidy shoes
   */
  public void tidyShoes() {
    isTidy = true;
  }

  /**
   * untidy shoes
   */
  public void untidyShoes() {
    isTidy = false;
  }

  /**
   * is tidy
   * @return {Boolean}
   */
  public Boolean isTidy() {
    return isTidy;
  }

  /**
   * get the direction of the shoe
   */
  public ShoeDirection getDirection() {
    return direction;
  }

  /**
   * set the direction of the shoe
   * @param dir
   */
  public void setDirection(ShoeDirection dir) {
    direction = dir;
  }

  @Override
  public String toString() {
    return "Shoe{" + "isTidy=" + isTidy + ", direction=" + direction + '}';
  }
}
