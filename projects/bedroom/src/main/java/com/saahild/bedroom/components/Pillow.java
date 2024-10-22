package com.saahild.bedroom.components;

import com.saahild.bedroom.util.PillowCovers;

public class Pillow {

  private Boolean fluffed;
  private int rotateAngle;
  private PillowCovers cover;
/**
 * 
 * @param pfluf should be fluffy or not
 * @param protateAngle the starting angle of the pillow
 */
  public Pillow(Boolean pfluf, int protateAngle) {
    rotateAngle = protateAngle;
    fluffed = pfluf;
    cover = PillowCovers.FLUFFY_COVER;
  }
/**
 * Pillow constructor
 */
  public Pillow() {
    fluffed = true;
    rotateAngle = 95;
    cover = PillowCovers.FLUFFY_COVER;
  }
/**
 * get the current rotation
 * @return
 */
  public int getRotation() {
    return rotateAngle;
  }
/**
 * rotate the pillow
 * @param deg the deg to rotate by
 */
  public void rotate(int deg) {
    rotateAngle += deg;
  }
/*
 * rotate the pillow by 5 degrees
 */
  public void rotate() {
    rotate(5);
  }
/**
 * is it fluffed
 */
  public Boolean isFluffed() {
    return fluffed;
  }
/**
 * fluf the pillow
 */
  public void fluf() {
    fluffed = true;
  }
/**
 * unfluf the pillow
 */
  public void unfluf() {
    fluffed = false;
  }
  /**
   * throw the pillow at the wall which also unlufs it and rotates it randomly
   */
public void throwPillowAtWall() {
  unfluf();
  rotate((int)Math.random() * 360);

}
/**
 * get the current cover
 * @return {PillowCovers}
 */
public PillowCovers getCurrentCover() {
    return cover;
  }
/**
 * Change Cover 
 * @param c
 */
  public void changeCover(PillowCovers c) {
    cover = c;
  }
/**
 * reset cover to fluffy
 */
  public void resetCover() {
    cover = PillowCovers.FLUFFY_COVER;
  }
  @Override
  public String toString() {
    return "Pillow{" +
            "fluffed=" + fluffed +
            ", rotateAngle=" + rotateAngle +
            ", cover=" + cover +
            '}';
  }
}
