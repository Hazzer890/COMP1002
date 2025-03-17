package PracticalThree;

public class Factorial {

    public static long factorialIterative(long input) {
        long factorial = 1;
        for (int ii = 1; ii <= input; ii++) {
            factorial *= ii;
        }
        return factorial;
    }

    public static long factorialRecursive(long input) {
        if (input == 0) {
            return 1;
        } else {
            return input * factorialRecursive(input - 1);
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide a number as an argument.");
            return;
        }

        long n;
        try {
            n = Long.parseLong(args[0]);
            if (n < 0) {
            throw new NumberFormatException("The number must be non-negative.");
            }
        } catch (NumberFormatException e) {
            System.err.println("Argument must be a valid non-negative integer.");
            return;
        }

        
        System.out.println("Iterative factorial of " + n + " is: " + factorialIterative(n));
        System.out.println("Recursive factorial of " + n + " is: " + factorialRecursive(n));
    }
}