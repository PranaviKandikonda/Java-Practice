public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer("Hello");

        System.out.println("Original StringBuffer: " + stringBuffer);

        // Returns the number of characters currently stored in the StringBuffer
        System.out.println("Length: " + stringBuffer.length());

        // Returns the current capacity of the StringBuffer i.e., how many characters it can hold before needing to resize.
        // Default capacity = 16. So, capacity = string length + 16
        System.out.println("Capacity: " + stringBuffer.capacity());

        // Append a string to the StringBuffer
        stringBuffer.append(" World");
        System.out.println("After append: " + stringBuffer);

        // Insert a string at a specific index
        stringBuffer.insert(5, ", and welcome to");
        System.out.println("After insert: " + stringBuffer.toString());

        // Replace a portion of the StringBuffer
        // start index is inclusive, end index is exclusive
        stringBuffer.replace(7, 12, "Java");
        System.out.println("After replace: " + stringBuffer.toString());

        // Delete a portion of the StringBuffer
        stringBuffer.delete(5, 6);
        System.out.println("After delete: " + stringBuffer.toString());

        // Reverse the StringBuffer
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer.toString());
    }
}
