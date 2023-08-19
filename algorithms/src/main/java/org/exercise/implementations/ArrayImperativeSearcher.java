package org.exercise.implementations;

import org.exercise.interfaces.ArrayManipulation;

public class ArrayImperativeSearcher implements ArrayManipulation {
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

