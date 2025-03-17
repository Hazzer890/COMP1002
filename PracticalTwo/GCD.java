
public class GCD {

    public static long gcdIterative(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long gcdRecursive(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcdRecursive(b, a % b);
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Please provide exactly two arguments.");
            return;
        }

        long a = 0;
        long b = 0;

        try {
            a = Long.parseLong(args[0]);
            b = Long.parseLong(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("Both arguments must be valid mathmatical integers.");
            return;
        }

        System.out.println("Iterative GCD of " + a + " and " + b + " is: " + gcdIterative(a, b));
        System.out.println("Recursive GCD of " + a + " and " + b + " is: " + gcdRecursive(a, b));
    }
    
}
