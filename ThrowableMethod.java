public class ThrowableMethod {
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            // throw new ArithmeticException(); // this returns null
            throw new ArithmeticException("Division by zero is not allowed."); // this returns custom message
        }
        return a / b;
    }
    public static void main(String[] args) {
        try {
            double d = divide(5.6, 0);
            System.out.println("Result: " + d);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());

            System.out.println("Stack Trace:");
            e.printStackTrace(); 
            System.out.println("String Representation: " + e.toString()); //prints the exception name along with the message
        }
    }
}
