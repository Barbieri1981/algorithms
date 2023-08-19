package org.exercise.implementations;

import org.exercise.interfaces.ArrayManipulation;

import java.util.Arrays;

public class ArrayBinarySearcher implements ArrayManipulation {
    @Override
    public int search(int[] array, int num) {
        Arrays.sort(array);
        return binarySearch(array, num, 0, array.length - 1);
    }

    private int binarySearch(final int[] array, final int num,  int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == num) {
                return mid;
            }

            if (array[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

