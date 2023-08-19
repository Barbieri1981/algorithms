import org.exercise.service.MathOperation;

public class Calculator implements MathOperation {
    public static void main(String[] args) {
        final Calculator calculator = new Calculator();
        //callCalculateSquare(calculator);
        callDistance(calculator);
    }

    private static void callDistance(final Calculator calculator) {
        final double x = 2.0;
        final double y = 2.0;
        double result = calculator.distance(x, y);
        System.out.println("Distance from (" + x + ", " + y + ") to origin is: " + result);
    }

    private static void callCalculateSquare(final Calculator calculator) {
        int number = 2;
        int result = calculator.calculateSquare(number);
        System.out.println("The square of " + number + " is: " + result);
    }
}

