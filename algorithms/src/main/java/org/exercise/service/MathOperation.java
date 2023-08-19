package org.exercise.service;

import java.util.Arrays;
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
    default int factorialImperative(final int n) {
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
    default int factorialDeclarative(int n) {
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
    default boolean isPrimeImperative(final int n) {
        if (n <= 1) {
            return false;
        }

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

    /**
     * Verifies if a number is prime
     * @param n
     * @return indicates if a number is prime
     */
    default boolean isPrimeDeclarative(final int n) {
        if (n <= 1) {
            return false;
        }
        long divisorCount = IntStream.iterate(1, i -> i + 1)
                .limit(n)
                .filter(i -> n % i == 0)
                .count();

        return divisorCount == 2;
    }

    /**
     * Sum the elements of an array
     * @param array the array to sum the element
     * @return the sum of the array elements
     */
    default int sumImperative(final int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Sum the elements of an array
     * @param array the array to sum the element
     * @return the sum of the array elements
     */
    default int sumDeclarative(final int[] array) {
        return Arrays.stream(array).sum();
    }

}
