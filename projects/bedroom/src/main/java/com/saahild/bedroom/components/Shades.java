package com.saahild.bedroom.components;

public class Shades {

  private Boolean isOpen;
  private int tilt;
/**
 * Constructor for Shades
 */
  public Shades() {
    tilt = 0;
    isOpen = false;
  }
/**
 * Constructor for Shades
 * @param isopen should router be opened by default
 */
  public Shades(Boolean isopen) {
    isOpen = isopen;
    tilt = 0;
  }
/**
 * is the shades open
 */
  public Boolean isOpen() {
    return isOpen;
  }
/** 
 * open the shades
 */
  public void open() {
    isOpen = true;
  }
/**
 * close the shades
 */
  public void close() {
    isOpen = false;
  }
/**
 * get the tilt of the shades
 * @return {int}
 */
  public int getTilt() {
    return tilt;
  }
/**
 * tilt the shades
 * @param deg degrees to tilt the shades
 */
  public void tilt(int deg) {
    tilt += deg;
  }
/**
 * tilt the shades by 5 degrees
 */
  public void tilt() {
    tilt(5);
  }
/**
 * untilt the shades
 */
  public void untilt() {
    tilt = 0;
  }
  @Override
  public String toString() {
    return "Shades{" +
            "isOpen=" + isOpen +
            ", tilt=" + tilt +
            '}';
  }
}
