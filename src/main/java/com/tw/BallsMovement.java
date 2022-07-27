package com.tw;

import processing.core.PApplet;

public class BallsMovement extends PApplet {
    public static final int WIDTH = 720;
    public static final int HEIGHT = 520;

    private static BallConfig[] configs = null;

    public BallsMovement()
    {
    }
    public BallsMovement(BallConfig[] configs)
    {
        this.configs = configs;
    }

    @Override
    public void draw() {
        if(configs==null)
        {
            System.out.println("Enpty");
            return;
        }
        else {
            drawCircle();
        }
    }



    private void drawCircle() {
            for (BallConfig config : configs) {
                ellipse(config.getxCord(), HEIGHT * config.getyCord(), config.getBallHeight(), config.getBallWidth());
                config.updatexCord();
            }

    }
    void create4BallMovement(BallConfig[] configs, String[] args)
    {
        BallsMovement ballsMovement = new BallsMovement(configs);
        PApplet.main("com.tw.BallsMovement",args);
    };
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }
}
