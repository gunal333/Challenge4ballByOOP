package com.tw;

public class BallConfig {
    private float xCord;
    private float yCord;
    private final float ballWidth = 10;
    private final float ballHeight = 10;
    private int speed;

    BallConfig(float xCord, float yCord, int speed)
   {
       this.xCord=xCord;
       this.yCord=yCord;
       this.speed=speed;
   }

    public float getBallWidth() {
        return ballWidth;
    }

    public float getBallHeight() {
        return ballHeight;
    }
    public void updatexCord()
    {
        this.xCord+=this.speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getxCord() {
        return xCord;
    }

    public void setxCord(float xCord) {
        this.xCord = xCord;
    }

    public float getyCord() {
        return yCord;
    }

    public void setyCord(float yCord) {
        this.yCord = yCord;
    }
}
