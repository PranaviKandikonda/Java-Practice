public class CharDataType {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = '8';
        
        char letter3 = 65; // ASCII value for 'A'
        char letter4 = 56; // ASCII value for '8'

        System.out.println("Character 1: " + letter1);
        System.out.println("Is letter1 a letter? " + Character.isLetter(letter1));
        System.out.println("Is letter1 a digit? " + Character.isDigit(letter1));

        System.out.println("Character 2: " + letter2);
        System.out.println("Is letter2 a letter? " + Character.isLetter(letter2));
        System.out.println("Is letter2 a digit? " + Character.isDigit(letter2));
        
        System.out.println("Character 3: " + letter3);
        System.out.println("Character 4: " + letter4);
    }
    
}
