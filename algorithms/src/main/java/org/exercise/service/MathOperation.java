package org.exercise.service;

import java.util.stream.IntStream;

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

    /**
     * Verify if a number is event
     * @param n
     * @return return true if the number is even
     */
    default boolean isEvent(final int n) {
        return n % 2 == 0;
    }

    /**
     * Calculate the factorial of a natural number
     * @param n
     * @return the factorial of a natural number
     */
    default int factorialWithLoop(final int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculate the factorial of a natural number
     * @param n
     * @return the factorial of a natural number
     */
    default int factorialWithStream(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    /**
     * Calculate the factorial of a natural number
     * @param n
     * @return the factorial of a natural number
     */
    default int factorialRecursive(final int n) {
        return (n == 0) ? 1 : n * factorialRecursive(n - 1);
    }

    /**
     * Verifies if a number is prime
     * @param n
     * @return indicates if a number is prime
     */
    default boolean isPrime(final int n) {
        int count = 0;
        int i = 1;
        while (i <= n && count < 3) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        return count == 2;
    }

}
