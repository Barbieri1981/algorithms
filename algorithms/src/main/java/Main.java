import org.exercise.service.ArrayManipulation;
import org.exercise.service.MathOperation;
import org.exercise.service.YearOperation;
import org.exercise.service.impl.DeclarativeSearcher;


public class Main implements MathOperation, YearOperation {

    public static void main(String[] args) {
        final Main calculator = new Main();
        final ArrayManipulation arrayManipulation = new DeclarativeSearcher();
        callCalculateSquare(calculator);
        callDistance(calculator);
        callIsEven(calculator);
        callIsLeap(calculator);
        callFactorial(calculator);
        callIsPrime(calculator);
        callSum(arrayManipulation);
        callSearch(arrayManipulation);

    }

    private static void callSearch(ArrayManipulation arrayManipulation) {
        int[] array = { 2, 1, 3, 0, 5 };
        int result = arrayManipulation.search(array, 3);
        System.out.println(result != -1
                ? "Element found at index: " + result
                : "Element not found.");
    }

    private static void callSum(ArrayManipulation calculator) {
        System.out.println("Sum of array elements: " + calculator.sumDeclarative(new int[]{2, 2, 2, 2}));
    }

    private static void callIsPrime(final Main calculator) {
        int n = 4;
        System.out.println(n + " " + (calculator.isPrimeImperative(n) ? "is a prime number" : "is not a prime number") + ".");
    }

    private static void callFactorial(final Main calculator) {
        final int number = 4;
        System.out.println("Factorial of " + number + " is: " + calculator.factorialRecursive(number));
    }

    private static void callIsLeap(final Main calculator) {
        final int year = 2023;
        System.out.println(year + " is " + (calculator.isLeap(year) ? "leap year" : "not leap year") + ".");
    }

    private static void callIsEven(final Main mathOperationImpl) {
        final int num = 2;
        System.out.println(num + " is " + (mathOperationImpl.isEvent(num) ? "even" : "odd") + ".");
    }

    private static void callDistance(final Main main) {
        final double x = 2.0;
        final double y = 2.0;
        System.out.println("Distance from (" + x + ", " + y + ") to origin is: " + main.distance(x, y));
    }

    private static void callCalculateSquare(final Main main) {
        int number = 2;
        System.out.println("The square of " + number + " is: " + main.calculateSquare(number));
    }
}

