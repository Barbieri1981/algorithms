package org.exercise.service;

public interface YearOperation {
    default boolean isLeap(final int n) {
        final boolean isDivisibleBy4 = n % 4 == 0;
        final boolean isDivisibleBy100 = n % 100 == 0;
        final boolean isDivisibleBy400 = n % 400 == 0;
        return (isDivisibleBy4 && !isDivisibleBy100) || isDivisibleBy400;
    }
}
