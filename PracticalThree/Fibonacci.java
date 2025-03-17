package PracticalThree;

public class Fibonacci {

    public static long iterativeFibonacci(long input) {
        if (input <= 1) {
            return input;
        }
        long fibonacci = 1;
        long prevFib = 1;

        for (int ii = 2; ii < input; ii++) {
            long temp = fibonacci;
            fibonacci += prevFib;
            prevFib = temp;
        }
        return fibonacci;
    }

    public static long recursiveFibonacci(long n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
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

        System.out.println("Iterative Fibonacci of " + n + " is: " + iterativeFibonacci(n));
        System.out.println("Recursive Fibonacci of " + n + " is: " + recursiveFibonacci(n));
    }
}
