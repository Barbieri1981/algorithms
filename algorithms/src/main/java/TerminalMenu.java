import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.exercise.implementations.ArrayDeclarativeSearcher;
import org.exercise.interfaces.ArrayManipulation;
import org.fusesource.jansi.Ansi;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.exercise.util.Utils;

import org.fusesource.jansi.AnsiConsole;

import static org.exercise.util.Utils.allEvenImperative;
import static org.fusesource.jansi.Ansi.ansi;

public class TerminalMenu {

    private static final Logger logger = LoggerFactory.getLogger(TerminalMenu.class);
    private final ArrayManipulation arrayManipulation = new ArrayDeclarativeSearcher();
    public static void main(String[] args) {
        try {
            AnsiConsole.systemInstall(); // enable color output
            TerminalMenu app = new TerminalMenu();
            app.run();
        } catch (Exception e) {
            logger.error("An error occurred:", e);
        } finally {
            AnsiConsole.systemUninstall();
        }
    }

    private void run() {
        try {
            Terminal terminal = TerminalBuilder.builder().system(true).build();
            LineReader reader = LineReaderBuilder.builder().terminal(terminal).build();

            Ansi welcomeMessage = ansi()
                    .fg(Ansi.Color.GREEN).a("Welcome to the Terminal Menu").reset();
            System.out.println(welcomeMessage);

            String[] options = {
                    ansi().fg(Ansi.Color.YELLOW).a("Calculate the square of a number").reset().toString(),
                    ansi().fg(Ansi.Color.YELLOW).a("Calculate the distance between two points").reset().toString(),
                    "Verify if a number is even",
                    "Verify if a year is a leap year",
                    "Calculate the factorial of a number",
                    "Verify if a number is prime",
                    "Calculate the sum of elements in an array",
                    "Search for a number in an array",
                    "Verify if an array has prime numbers",
                    "Verify if all elements of an array are even",
                    "Exit"};

            int selectedOption = getUserChoice(reader, options);

            if (selectedOption == options.length) {
                System.out.println("Exiting the program.");
            } else {
                performSelectedAction(selectedOption, arrayManipulation);
            }
        } catch (Exception e) {
            logger.error("An error occurred:", e);
        }
    }

    private int getUserChoice(LineReader reader, String[] options) {
        while (true) {
            System.out.println("Select an option:");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            String input = reader.readLine();
            try {
                int selectedOption = Integer.parseInt(input);
                if (selectedOption >= 1 && selectedOption <= options.length) {
                    return selectedOption;
                } else {
                    System.out.println("Invalid option. Enter a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid option. Enter a valid number.");
            }
        }
    }

    private static void performSelectedAction(final int option, final ArrayManipulation arrayManipulation ) {
        switch (option) {
            case 1:
                callCalculateSquare();
                break;
            case 2:
                callDistance();
                break;
            case 3:
                callIsEven();
                break;
            case 4:
                callIsLeap();
                break;
            case 5:
                callFactorial();
                break;
            case 6:
                callIsPrime();
                break;
            case 7:
                callSum();
                break;
            case 8:
                callSearch(arrayManipulation);
                break;
            case 9:
                verifyIfAnArrayHasPrimeNumbers();
                break;
            case 10:
                verifyIfAllTheElmentsAreEven();
                break;
        }
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
