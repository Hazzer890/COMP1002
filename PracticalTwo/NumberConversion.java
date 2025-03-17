
public class NumberConversion {
    public static String convertToBase(int number, int base) {
        if (base < 2 || base > 16) {
            throw new IllegalArgumentException("Base must be between 2 and 16.");
        }
        if (number < base) {
            return Integer.toString(number, base);
        } else {
            return convertToBase(number / base, base) + Integer.toString(number % base, base);
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide a number and a base as arguments.");
            }
            if (args.length > 2) {
                throw new IllegalArgumentException("Too many arguments provided.");
            }
            if (!args[0].matches("\\d+") || !args[1].matches("\\d+")) {
                throw new IllegalArgumentException("Arguments must be integers.");
            }
            int number = Integer.parseInt(args[0]);
            int base = Integer.parseInt(args[1]);
            System.out.println("Number " + number + " in base " + base + " is: " + convertToBase(number, base));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
