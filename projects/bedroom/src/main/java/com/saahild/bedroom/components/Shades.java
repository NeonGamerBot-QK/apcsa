package com.saahild.bedroom.components;


public class Shades {
    private Boolean isOpen;
    private int tilt;
    public Shades() {
        tilt = 0;
        isOpen = false;
    }    
    public Shades(Boolean isopen) {
        isOpen = isopen;
        tilt = 0;
    }
    public Boolean isOpen() {
        return isOpen;
    }
    public void open() {
        isOpen = true;
    }
    public void close() {
        isOpen = false;
    }
    public int getTilt() {
        return tilt;
    }
    public void tilt(int deg) {
        tilt += deg;
    }
    public void tilt() {
        tilt(5);
    }
    public void untilt() {
        tilt = 0;
    }
}
