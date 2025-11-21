public class NumberSystem {
    public static void main(String[] args) {
        int decimalNumber = 42; // Decimal representation
        int binaryNumber = 0b101010; // Binary representation (prefix 0b)
        int octalNumber = 052; // Octal representation (prefix 0)
        int hexNumber = 0x2A; // Hexadecimal representation (prefix 0x)

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryNumber);
        System.out.println("Octal: " + octalNumber);
        System.out.println("Hexadecimal: " + hexNumber);

        // We use toBinaryString, toOctalString, toHexString methods of Integer class to convert decimal to binary, octal and hexadecimal strings respectively
        System.out.println("Binary (from decimal): " + Integer.toBinaryString(decimalNumber));
        System.out.println("Octal (from decimal): " + Integer.toOctalString(decimalNumber));
        System.out.println("Hexadecimal (from decimal): " + Integer.toHexString(decimalNumber));
    }
}