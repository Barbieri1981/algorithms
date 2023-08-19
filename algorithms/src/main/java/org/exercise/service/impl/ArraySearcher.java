package org.exercise.service.impl;

import org.exercise.service.ArrayManipulation;

public class ArraySearcher implements ArrayManipulation {
    @Override
    public int search(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
}

