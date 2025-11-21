public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            // Manually throwing an exception
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are eligible.");
        }
    }
}
