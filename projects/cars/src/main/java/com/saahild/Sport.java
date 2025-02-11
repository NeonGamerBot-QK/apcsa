package com.saahild;

public class Sport extends Car {

  public int numDoors;
  private boolean isConvertible;

  public Sport(
    String manufacture,
    int year,
    int mpg,
    int maxSpeed,
    String fuel,
    String brand,
    int doors,
    boolean isConvertible
  ) {
    super(manufacture, year, mpg, maxSpeed, fuel, brand);
    this.numDoors = doors;
    this.isConvertible = isConvertible;
  }

  public boolean isConvertible() {
    return isConvertible;
  }

  public int getDoors() {
    return numDoors;
  }

  @Override
  public void honk() {
    System.out.println("LOUD Honk Honk");
  }
}
