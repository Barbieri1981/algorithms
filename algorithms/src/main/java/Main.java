import org.exercise.interfaces.ArrayManipulation;
import org.exercise.implementations.ArrayDeclarativeSearcher;
import org.exercise.util.Utils;

import static org.exercise.util.Utils.allEven;
import static org.exercise.util.Utils.allEvenImperative;

public class Main {

    public static void main(String[] args) {
        final ArrayManipulation arrayManipulation = new ArrayDeclarativeSearcher();
        callCalculateSquare();
        callDistance();
        callIsEven();
        callIsLeap();
        callFactorial();
        callIsPrime();
        callSum();
        callSearch(arrayManipulation);
        verifyIfAnArrayHasPrimeNumbers();
        verifyIfAllTheElmentsAreEven();
    }

    private static void verifyIfAllTheElmentsAreEven() {
        System.out.println("All numbers are even: " + allEvenImperative(new int[]{2, 4, 8}));
    }

    private static void verifyIfAnArrayHasPrimeNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        String message = Utils.hasAtLeastOnePrimeImperative(numbers) ? "The array has at least one prime number."
                : "The array doesn't have any prime numbers.";
        System.out.println(message);
    }

    private static void callSearch(ArrayManipulation arrayManipulation) {
        int[] array = { 2, 1, 3, 0, 5 };
        int result = arrayManipulation.search(array, 3);
        System.out.println(result != -1
                ? "Element found at index: " + result
                : "Element not found.");
    }

    private static void callSum() {
        System.out.println("Sum of array elements: " + Utils.sumDeclarative(new int[]{2, 2, 2, 2}));
    }

    private static void callIsPrime() {
        int n = 4;
        System.out.println(n + " " + (Utils.isPrimeImperative(n) ? "is a prime number" : "is not a prime number") + ".");
    }

    private static void callFactorial() {
        final int number = 4;
        System.out.println("Factorial of " + number + " is: " + Utils.factorialRecursive(number));
    }

    private static void callIsLeap() {
        final int year = 2023;
        System.out.println(year + " is " + (Utils.isLeap(year) ? "leap year" : "not leap year") + ".");
    }

    private static void callIsEven() {
        final int num = 2;
        System.out.println(num + " is " + (Utils.isEvent(num) ? "even" : "odd") + ".");
    }

    private static void callDistance() {
        final double x = 2.0;
        final double y = 2.0;
        System.out.println("Distance from (" + x + ", " + y + ") to origin is: " + Utils.distance(x, y));
    }

    private static void callCalculateSquare() {
        int number = 2;
        System.out.println("The square of " + number + " is: " + Utils.calculateSquare(number));
    }
}

