package com.dodevjutsu.kata.marsrover.test_helpers;

import com.dodevjutsu.kata.marsrover.Planet;
import com.dodevjutsu.kata.marsrover.Rover;
import com.dodevjutsu.kata.marsrover.SimplePlanet;

public class RoverBuilder {
    private int y;
    private int x;
    private String directionCode;
    private Planet planet;

    public RoverBuilder() {
        this.planet = new SimplePlanet();
    }

    public static RoverBuilder aRover() {
        return new RoverBuilder();
    }

    public RoverBuilder at(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public RoverBuilder facing(String directionCode) {
        this.directionCode = directionCode;
        return this;
    }

    public Rover build() {
        return new Rover(x, y, directionCode, planet);
    }

    public RoverBuilder onAWrappingPlanet(int width, int height) {
        this.planet = new WrappingPlanet(width, height);
        return this;
    }
}