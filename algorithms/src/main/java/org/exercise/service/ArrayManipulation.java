package org.exercise.service;

import java.util.Arrays;

public interface ArrayManipulation {

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

    /**
     * Find an int inside an array
     * @param array the array of ints
     * @param num the int to find
     * @return the first position where the element is inside the array
     */
    int search(final int[] array, final int num);
}
