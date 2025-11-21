public class StaticNestedClass {
    static int n1 = 10;
    private static int n2 = 20;
    public int n3 = 30;

    static class Nested {
        void display() {
            System.out.println("n1 = " + n1);
            System.out.println("n2 = " + n2);
            // System.out.println("n3 = " + n3); // This would cause a compile-time error
        }
    }
}
