import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);

        Collections.sort(numbers); // Sorting in ascending order

        int idx1 = Collections.binarySearch(numbers, 10); 
        System.out.println("Index of 7: " + idx1); // If element is found, returns its index

        int idx2 = Collections.binarySearch(numbers, 4); 
        System.out.println("Index of 4: " + idx2); // If element is not found, returns (-(insertion point) - 1)

        /*
        // List is an interface. We are using ArrayList class which implements List interface.
        List<String> list1 = new ArrayList<>();  

        // Implementing Collection interface using ArrayList class
        Collection<Integer> list2 = new ArrayList<>();

        // If you don't specify the type, the default datatype is Object
        List list3 = new ArrayList<>();

        // Using ArrayList class directly
        ArrayList<Integer> list4 = new ArrayList<>();

        // ArrayList<String>  list5 = {"One", "Two", "Three"}; // This is not valid in Java. We cannot initialize an ArrayList like this.

        list1.add("Alice"); // Adds an element at the end of the list
        list1.add("Bob");
        list1.add("Charlie");
        list1.add("Diana");
        list1.add(2, "Ethan"); // Adds an element at index 2
        System.out.println("List1: " + list1);   // In case of arrays, if we print the array i.e. System.out.println(a1), it prints the reference of the array. But in case of lists, it prints the elements. To print the elements of an array, we need to use Arrays.toString(a1).
        System.out.println("Size of List1: " + list1.size()); // Returns the size of the list

        list2.add(10); 
        list2.add(20);
        list2.add(30);
        System.out.println("List2: " + list2);

        list3.add(100); // Adding integer to a raw type list
        list3.add("Frank"); // Adding string to a raw type list
        list3.add(45.67); // Adding double to a raw type list
        System.out.println("List3 (raw type): " + list3);

        list4.add(10);
        list4.add(20);
        list4.add(30);
        System.out.println("List4: " + list4);

        list1.remove(0); // Removes the element at index 0
        System.out.println("List1 after removing index 0: " + list1);
        list1.remove("Diana"); // Removes the element "Diana"
        System.out.println("List1 after removing 'Diana': " + list1);

        list1.set(1, "Grace"); // Sets the element at index 1 to "Grace"
        System.out.println("List1 after setting index 1 to 'Grace': " + list1);

        System.out.println("Is List1 empty? " + list1.isEmpty()); // Checks if list1 is empty
        System.out.println("Is list2 empty? " + list2.isEmpty()); // Checks if list2 is empty

        System.out.println("Does List1 contain 'Charlie'? " + list1.contains("Charlie")); // Checks if list1 contains "Charlie"
        System.out.println("Does List3 contain 'Charlie'? " + list3.contains("Charlie")); // Checks if list3 contains "Charlie"

        System.out.println("Element at index 2 in List1: " + list1.get(2)); // Gets the element at index 2

        list1.clear(); // Clears all elements from list1
        System.out.println("List1 after clearing: " + list1);

        System.out.println("Are list2 and list4 equal? " + list2.equals(list4)); // Checks if list2 and list4 are equal. Returns true if they have the same elements in the same order.
        */

    }
    
}
