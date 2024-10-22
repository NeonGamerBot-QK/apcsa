package com.saahild.bedroom.components;

public class Phone {

  private Boolean isOn;
  private Boolean isCharging;
  private int battery;
/**
 * 
 * @param pon is on by default 
 * @param pcharge is charging by default
 * @param pbat  default battery precent
 */
  public Phone(Boolean pon, Boolean pcharge, int pbat) {
    isOn = pon;
    isCharging = pcharge;
    battery = pbat;
  }
/**
 * is on
 */
  public Boolean isOn() {
    return isOn;
  }
/**
 * turn on the phone
 */
  public void turnOn() {
    isOn = true;
  }
/**
 * turn off the phone
 */
  public void turnOff() {
    isOn = false;
  }
/**
 * is charging
 * @return
 */
  public Boolean isCharging() {
    return isCharging;
  }
/**
 * start charging the phone
 */
  public void startCharging() {
    isCharging = true;
  }
/**
 * stop charging the phone
 */
  public void stopCharging() {
    isCharging = false;
  }
/**
 * get the battery percentage
 * @return
 */
  public int getBattery() {
    return battery;
  }

  /**
   *
   * @param deg The amount by which the battery is to be increased
   */
  public void increaseBattery(int deg) {
    battery += deg;
  }
/**
 * Increase the battery by 5
 */
  public void increaseBattery() {
    increaseBattery(5);
  }
/**
 * decrease the battery by deg
 * @param deg the amount to decrease
 */
  public void decreaseBattery(int deg) {
    battery -= deg;
  }
/**
 * decrease the battery by 5
 */
  public void decreaseBattery() {
    decreaseBattery(5);
  }
  
  @Override 
  public String toString() {
    return "Phone{" +
            "isOn=" + isOn +
            ", isCharging=" + isCharging +
            ", battery=" + battery +
            '}';
  }
}
