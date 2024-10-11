// Write the class Radio

// package com.saahild;

public class Radio {

  private double frequency;
  private boolean isOnAM;

  public Radio() {
    this.frequency = 0;
    this.isOnAM = false;
  }

  public double  getFrequency() {
   if(this.isOnAM) {
    return (int) this.frequency;
   } else {
    return this.frequency;
   }
  }

  public void setFrequency(double  frequency) {
    if(this.isOnAM) {
      this.frequency = (int) frequency;
    } else {
      this.frequency = frequency;
    }
  }

  public boolean isOnAM() {
    return isOnAM;
  }
public void nextStation() {
  if(this.isOnAM) {
    setFrequency(getFrequency() + 10);
  } else {
    setFrequency(getFrequency() + 0.2);
  }
}
public void prevStation() {
  if(this.isOnAM) {
    setFrequency(getFrequency() - 10);
  } else {
    setFrequency(getFrequency() - 0.2);
  }
}
  public void setOnAM(boolean isOnAM) {
    this.isOnAM = isOnAM;
  }
  public void toggleAM() {
    this.isOnAM = !isOnAM;
  }
  public void turnDial(int change) {
    if (isOnAM) {
      frequency += change;
      frequency = (int) frequency;
    } else {
      frequency += change * 10;
    }
  }
}
