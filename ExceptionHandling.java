import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number1:");
            int number1 = scanner.nextInt();
            System.out.println("Enter number2:");
            int number2 = scanner.nextInt();
            int result = number1 / number2;
            System.out.println("Result: " + result);
            scanner.close();
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            // this catch block handles any other exceptions
            System.out.println("An exception has occurred");
        }
        finally {
            System.out.println("This statement is always executed.");
        }
    }
}
