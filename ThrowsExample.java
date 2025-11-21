public class ThrowsExample {
    public static void divide(int a, int b) throws ArithmeticException, NumberFormatException {
        int res = a/b;
        System.out.println("Result: " + res);
    }

    public static void main(String[] args) {
        try {
            // divide(10, 0);
            divide(10, Integer.parseInt("abc"));
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }
    }
}
