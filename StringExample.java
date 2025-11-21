public class StringExample {
    public static void main(String[] args) {
        String s1 = "Hello, World!"; // String literal
        String obj1 = new String("I like programming"); // String object

        System.out.println(s1 + " " + obj1); // Concatenating string literal and object

        System.out.println(4 + 5 + "6");
        System.out.println(4 + "5" + 6 + 7); // If we add a string anywhere, everything after that is treated as a string
    }   
}
