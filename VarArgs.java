public class VarArgs {
    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(10, 20);
        printNumbers(); // no arguments

        getInfo("Alice", 30, "Reading", "Traveling", "Swimming");
        getInfo("Bob", 25); // no hobbies
    }

    static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    static void getInfo(String name, int age, String... hobbies) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Hobbies: ");
        for (String hobby : hobbies) {
            System.out.print(hobby + " ");
        }
        System.out.println();
    }
}
