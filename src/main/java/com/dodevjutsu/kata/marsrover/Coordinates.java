package com.dodevjutsu.kata.marsrover;

public class Coordinates {
    private final int x;
    private final int y;
    private final Planet planet;

    public Coordinates(int x, int y, Planet planet) {
        this.x = x;
        this.y = y;
        this.planet = planet;
    }

    public Coordinates incrementX(int displacement) {
        return new Coordinates(x + displacement, y, planet).locate();
    }

    public Coordinates incrementY(int displacement) {
        return new Coordinates(x, y + displacement, planet).locate();
    }

    private Coordinates locate() {
        return this.planet.at(this);
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        if (x != that.x) return false;
        return y == that.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
