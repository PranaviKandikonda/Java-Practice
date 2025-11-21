public class LocalClass {
    void display() {
        System.out.println("Inside Local Class");
        int classVariable = 100; // effectively final. if you change this value, then this variable is no longer a final variable.
        // classVariable = 150; 
        final int localVariable = 200; // final

        // Local class defined within a method
        class Inner {
            void innerDisplay() {
                System.out.println("Inside Inner Class");
                System.out.println("Class Variable: " + classVariable);
                System.out.println("Local Variable: " + localVariable);
            }
        }
        // Creating an instance of the local class. Can be done only within the method.
        Inner inner = new Inner();
        inner.innerDisplay();
    }
    // Inner inner2 = new Inner(); // Error: Cannot resolve symbol 'Inner'
}
