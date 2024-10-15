package com.saahild.bedroom;

import com.saahild.bedroom.components.Bed;
import com.saahild.bedroom.components.PairOfShoes;
import com.saahild.bedroom.components.Pillow;

public class Bedroom {

  public Pillow pillow;
  public Bed bed;
  public PairOfShoes shoes;

  public Bedroom() {
    pillow = new Pillow();
    bed = new Bed();
    shoes = new PairOfShoes();
    shoes.tidyShoes();
  }

  public Bedroom(Boolean flufPillow) {
    pillow = new Pillow();
    bed = new Bed();
    shoes = new PairOfShoes();
    if (flufPillow) {
      pillow.fluf();
    }
  }
}
