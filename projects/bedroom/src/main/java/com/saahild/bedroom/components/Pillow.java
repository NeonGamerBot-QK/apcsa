package com.saahild.bedroom.components;

import com.saahild.bedroom.util.PillowCovers;

public class Pillow {
    private Boolean fluffed ;
    private int rotateAngle;
    private PillowCovers cover;

    public Pillow(Boolean pfluf, int protateAngle) {
        rotateAngle = protateAngle;
        fluffed = pfluf;
        cover = PillowCovers.FLUFFY_COVER;
    }

    public Pillow() {
        fluffed = true;
        rotateAngle = 95;
        cover = PillowCovers.FLUFFY_COVER;
    }

    public int getRotation() {
        return rotateAngle;
    }

    public void rotate(int deg) {
        rotateAngle += deg;
    }

    public void rotate() {
        rotate(5);
    }

    public Boolean isFluffed() {
        return fluffed;
    }

    public void fluf() {
        fluffed = true;
    }

    public void unfluf() {
        fluffed = false;
    }

    public PillowCovers getCurrentCover() {
        return cover;
    }

    public void changeCover(PillowCovers c) {
        cover = c;
    }

    public void resetCover() {
        cover = PillowCovers.FLUFFY_COVER;
    }
}
