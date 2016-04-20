package com.dodevjutsu.kata.marsrover.test_helpers;

import com.dodevjutsu.kata.marsrover.Rover;

import static com.dodevjutsu.kata.marsrover.test_helpers.RoverBuilder.aRover;

public class RoverTestsHelpers {
    public static Rover locatedAt(int x, int y, String directionCode) {
        return aRover().at(x, y).facing(directionCode).build();
    }

    public static Rover stillLocatedAt(int x, int y, String directionCode) {
        return locatedAt(x, y, directionCode);
    }
}
