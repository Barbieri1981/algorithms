package org.exercise.service.impl;

import org.exercise.service.ArrayManipulation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DeclarativeSearcher implements ArrayManipulation {
    @Override
    public int search(int[] array, int num) {
        return Arrays.stream(array)
                .boxed() // Convert int[] to Stream<Integer>
                .filter(element -> element == num)
                .findFirst()
                .map(element -> Arrays.stream(array)
                        .boxed() // Convert int[] to Stream<Integer>
                        .collect(Collectors.toList())
                        .indexOf(num))
                .orElse(-1);
    }
}

