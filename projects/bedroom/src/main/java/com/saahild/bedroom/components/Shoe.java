package com.saahild.bedroom.components;

import com.saahild.bedroom.util.ShoeDirection;

public class Shoe {

  private Boolean isTidy;
  public ShoeDirection direction;

  public Shoe(ShoeDirection dir) {
    direction = dir;
  }

  public void tidyShoes() {
    isTidy = true;
  }

  public void untidyShoes() {
    isTidy = false;
  }

  public Boolean isTidy() {
    return isTidy;
  }

  public ShoeDirection getDirection() {
    return direction;
  }

  public void setDirection(ShoeDirection dir) {
    direction = dir;
  }
}
