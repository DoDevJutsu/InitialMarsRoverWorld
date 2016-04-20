package com.dodevjutsu.kata.marsrover;

public class SimplePlanet implements Planet {
    @Override
    public Coordinates at(Coordinates coordinates) {
        return coordinates;
    }
}
