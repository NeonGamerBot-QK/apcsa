package com.saahild.bedroom.components;

public class Monitor {

  private Boolean isOn;
  private int brightness;
/**
 * Constructor for the Monitor class
 */
  public Monitor() {
    isOn = false;
    brightness = 0;
  }
/**
 * is it ON
 * @return Boolean
 */
  public Boolean isOn() {
    return isOn;
  }
/**
 * Turn on the monitor
 */
  public void turnOn() {
    isOn = true;
  }
/**
 * Turn off the monitor
 */
  public void turnOff() {
    isOn = false;
  }
/**
 * Get the brightness of the monitor
 * @return
 */
  public int getBrightness() {
    return brightness;
  }
/**
 * increase the brightness of the monitor
 * @param deg The amount by which the brightness is to be increased
 */
  public void increaseBrightness(int deg) {
    brightness += deg;
  }
/**
 * Increase the brightness of the monitor by 5
 */
  public void increaseBrightness() {
    increaseBrightness(5);
  }
/**
 * Decrease the brightness of the monitor
 * @param deg deg to decrease the brightness 
 */
  public void decreaseBrightness(int deg) {
    brightness -= deg;
  }
/**
 * Decrease the brightness of the monitor by 5
 */
  public void decreaseBrightness() {
    decreaseBrightness(5);
  }
  @Override
  public String toString() {
  return "Monitor{" +
    "isOn=" + isOn +
    ", brightness=" + brightness +
    '}';
  }
}
