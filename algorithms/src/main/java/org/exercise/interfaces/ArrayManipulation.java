package org.exercise.interfaces;

import java.util.Arrays;

public interface ArrayManipulation {

    /**
     * Find an int inside an array
     * @param array the array of ints
     * @param num the int to find
     * @return the first position where the element is inside the array
     */
    int search(final int[] array, final int num);
}
