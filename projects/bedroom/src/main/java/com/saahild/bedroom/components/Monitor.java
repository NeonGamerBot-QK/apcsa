package com.saahild.bedroom.components;


public class Monitor {
    private Boolean isOn;
    private int brightness;
    public Monitor() {
    isOn = false;
    brightness = 0;
    }    
    public Boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    public int getBrightness() {
        return brightness;
    }
    public void increaseBrightness(int deg) {
        brightness += deg;
    }
    public void increaseBrightness() {
        increaseBrightness(5);
    }
    public void decreaseBrightness(int deg) {
        brightness -= deg;
    }
    public void decreaseBrightness() {
        decreaseBrightness(5);
    }
}
