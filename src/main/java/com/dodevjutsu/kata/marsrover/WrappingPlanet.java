package com.dodevjutsu.kata.marsrover;

public class WrappingPlanet implements Planet {

    private final int width;
    private final int height;

    public WrappingPlanet(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Coordinates at(Coordinates coordinates) {
        final int newX = coordinates.getX() % width;
        final int newY = coordinates.getY() % height;
        return new Coordinates(newX, newY, this);
    }
}
