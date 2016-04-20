package com.dodevjutsu.kata.marsrover;

public class Coordinates {
    private final int x;
    private final int y;

    private static final int maxX = 20;
    private static final int maxY = 20;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates incrementX(int displacement) {
        return new Coordinates(x + displacement, y);
    }

    public Coordinates incrementY(int displacement) {
        int newY;

        if (y == maxY)
            newY = 0;
        else
            newY = y + displacement;

        return new Coordinates(x, newY);
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
}
