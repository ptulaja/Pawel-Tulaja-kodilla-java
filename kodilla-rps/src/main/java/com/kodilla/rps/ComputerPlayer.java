package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer implements RpsPlayer {

    private final Random random;

    public ComputerPlayer(Random random) {
        this.random = random;
    }

    public String play() {
        return OPTIONS[this.random.nextInt(OPTIONS.length)];
    }
}
