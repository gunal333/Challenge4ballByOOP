package com.tw;

public class Main {
    public static void main(String[] args) {
        BallConfig[] configs = new BallConfig[4];
        configs[0] = new BallConfig(0, (float) 0.2, 1);
        configs[1] = new BallConfig(0, (float) 0.4, 2);
        configs[2] = new BallConfig(0, (float) 0.6, 3);
        configs[3] = new BallConfig(0, (float) 0.8, 4);
        BallsMovement ballsMovement = new BallsMovement();
        ballsMovement.create4BallMovement(configs,args);
    }
}
