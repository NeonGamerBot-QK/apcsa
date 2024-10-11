// Write the class Radio

package com.saahild;

public class Radio {

  public static void Radio() {
    this.frequency = 0;
    this.isOnAM = false;
  }

  private int frequency;
  private boolean isOnAM;

  public int getFrequency() {
    return frequency;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  public boolean isOnAM() {
    return isOnAM;
  }

  public void setOnAM(boolean isOnAM) {
    this.isOnAM = isOnAM;
  }

  public void turnDial(int change) {
    if (isOnAM) {
      frequency += change;
    } else {
      frequency += change * 10;
    }
  }
}
