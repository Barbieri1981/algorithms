import org.exercise.service.MathOperation;
import org.exercise.service.YearOperation;


public class Main implements MathOperation, YearOperation {
    public static void main(String[] args) {
        final Main calculator = new Main();
        callCalculateSquare(calculator);
        callDistance(calculator);
        callIsEven(calculator);
        callIsLeap(calculator);
        callFactorial(calculator);
        callIsPrime(calculator);

    }

    private static void callIsPrime(final Main calculator) {
        int n = 4;
        System.out.println(n + " " + (calculator.isPrime(n) ? "is a prime number" : "is not a prime number") + ".");
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

