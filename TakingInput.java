import java.util.Scanner; //1. Importing the Scanner class

public class TakingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //2. Creating a Scanner object
        
        // 3. Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  //Taking integer input
        System.out.println("You entered: " + number);

        System.out.print("Enter a floating-point number: ");
        float decimal = scanner.nextFloat();  //Taking floating-point input
        System.out.println("You entered: " + decimal);

        System.out.print("Enter a string: ");
        String text = scanner.next();  //Taking string input
        System.out.println("You entered: " + text);

        System.out.print("Enter a string with spaces: ");
        scanner.nextLine(); // Consume the leftover newline
        String textWithSpaces = scanner.nextLine();  //Taking string input with spaces
        System.out.println("You entered: " + textWithSpaces);

        // 4. Closing the scanner
        scanner.close();
    }
}
