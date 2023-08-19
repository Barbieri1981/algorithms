package org.exercise.service;

public interface MathOperation {
    /**
     * Calculate the square
     * @param number
     * @return the result of multiplying a number by itself
     */
    default int calculateSquare(final int number) {
        return number * number;
    }

    /**
     * Calculate the distance between two points
     * @param
     * @param
     * @return the distance
     */
    default double distance(final double x, final double y) {
        return Math.sqrt(x * x + y * y);
    }
}
