import java.util.*;

public class SetInterfaceExample {
    public static void main(String[] args) {
        // Hashset
        HashSet<String> carsSet = new HashSet<>();
        carsSet.add("Volvo");
        carsSet.add("BMW");
        carsSet.add("Ford");
        carsSet.add("Volvo"); // Duplicate, will not be added
        carsSet.add("Honda");
        System.out.println("HashSet: " + carsSet); // The elements may appear in any order. They are not displayed in the order they were added.

        // LinkedHashSet
        LinkedHashSet<String> linkedCarsSet = new LinkedHashSet<>();
        linkedCarsSet.add("Volvo");
        linkedCarsSet.add("BMW");
        linkedCarsSet.add("Ford");
        linkedCarsSet.add("Volvo"); // Duplicate, will not be added
        linkedCarsSet.add("Honda");
        System.out.println("LinkedHashSet: " + linkedCarsSet); // The elements are displayed in the order they were added.

        // TreeSet example-1
        TreeSet<String> treeCarsSet = new TreeSet<>();
        treeCarsSet.add("Volvo");
        treeCarsSet.add("BMW");
        treeCarsSet.add("Ford");
        treeCarsSet.add("Volvo"); // Duplicate, will not be added
        treeCarsSet.add("Honda");
        System.out.println("TreeSet: " + treeCarsSet); // The elements are displayed in alphabetical order.
        System.out.println("TreeSet in descending order: " + treeCarsSet.descendingSet());

        System.out.println("First element in treeCarsSet: " + treeCarsSet.first());
        System.out.println("Last element in treeCarsSet: " + treeCarsSet.last());

        System.out.println("Elements less than 'Honda': " + treeCarsSet.headSet("Honda"));
        System.out.println("Elements less than or equal to 'Honda': " + treeCarsSet.headSet("Honda", true));
        
        System.out.println("Elements greater than 'Honda': " + treeCarsSet.tailSet("Honda", false));
        System.out.println("Elements greater than or equal to 'Honda': " + treeCarsSet.tailSet("Honda", true));
        
        System.out.println("Elements between 'BMW' and 'Volvo': " + treeCarsSet.subSet("BMW", "Volvo")); // toElement is exclusive
        System.out.println("Elements between 'BMW' and 'Volvo' (inclusive): " + treeCarsSet.subSet("BMW", true, "Volvo", true));
        
        // remove first and last elements
        treeCarsSet.pollFirst();
        treeCarsSet.pollLast();
        System.out.println("TreeSet after removing first and last elements: " + treeCarsSet);

        // TreeSet example-2
        TreeSet<Integer> numbersSet = new TreeSet<>();
        numbersSet.add(5);
        numbersSet.add(1);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.add(1); // Duplicate, will not be added
        System.out.println("TreeSet of Numbers: " + numbersSet); // The elements are displayed in ascending order.
       
        System.out.println("TreeSet of Numbers in descending order: " + numbersSet.descendingSet());

        System.out.println("First element in numbersSet: " + numbersSet.first());
        System.out.println("Last element in numbersSet: " + numbersSet.last());
        
        System.out.println("Elements less than 3: " + numbersSet.headSet(3));
        System.out.println("Elements less than or equal to 3: " + numbersSet.headSet(3, true));
    }
}
