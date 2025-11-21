import java.util.Random; // 1. Importing the Random class from java.util package

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random(); //2. Creating an instance of the Random class

        int randomNumber1 = random.nextInt(100); // Generate a random number between 0 and 99
        System.out.println("Random Number 1: " + randomNumber1);

        int randomNumber2 = random.nextInt(30, 100); // Generate another random number between 0 and 99
        System.out.println("Random Number 2: " + randomNumber2);

        double randomDouble = random.nextDouble(); // Generate a random double between 0.0 and 1.0
        System.out.println("Random Double: " + randomDouble);

        boolean randomBoolean = random.nextBoolean(); // Generate a random boolean value
        System.out.println("Random Boolean: " + randomBoolean);

        float randomFloat = random.nextFloat(); // Generate a random float between 0.0 and 1.0
        System.out.println("Random Float: " + randomFloat);

        long randomLong = random.nextLong(); // Generate a random long value
        System.out.println("Random Long: " + randomLong);
    }
}
