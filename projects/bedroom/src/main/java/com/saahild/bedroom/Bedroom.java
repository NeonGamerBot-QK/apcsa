package com.saahild.bedroom;

import com.saahild.bedroom.components.Bed;
import com.saahild.bedroom.components.Monitor;
import com.saahild.bedroom.components.PairOfShoes;
import com.saahild.bedroom.components.Phone;
import com.saahild.bedroom.components.Pillow;
import com.saahild.bedroom.components.Router;
import com.saahild.bedroom.components.Shades;

public class Bedroom {

  public Pillow pillow;
  public Bed bed;
  public PairOfShoes shoes;
  public Router router;
  public Monitor monitor;
  public Shades shades;
  public Phone phone;

  public Bedroom() {
    initVars();
  }

  private void initVars() {
    pillow = new Pillow();
    bed = new Bed();
    shoes = new PairOfShoes();
    router = new Router(true);
    monitor = new Monitor();
    shades = new Shades();
    phone = new Phone(true, false, 100);
  }

  @Override
  public String toString() {
    return (
      "Bedroom: \n" +
      bed.toString() +
      "\n" +
      pillow.toString() +
      "\n" +
      shoes.toString() +
      "\n" +
      router.toString() + 
      "\n" +
      monitor.toString() +
      "\n" +
      shades.toString() +
      "\n" +
      phone.toString()
    );
  }
}
