import static java.lang.Math.*;

public class StaticImport {
    public static void main(String[] args) {
        double pi = PI; // Using static import for Math.PI
        double e = E;   // Using static import for Math.E
        double sqrtValue = sqrt(16); // Using static import for Math.sqrt

        System.out.println("Value of PI: " + pi);
        System.out.println("Value of E: " + e);
        System.out.println("Square root of 16: " + sqrtValue);
    }
}
