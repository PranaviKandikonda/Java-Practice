import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        // first element indicates datatype of key, second element indicates datatype of value
        Map<String, Integer> carsMap = new HashMap<>();

        // Adding key-value pairs to the map
        carsMap.put("BMW", 100000);
        carsMap.put("Audi", 90000);
        carsMap.put("Mercedes", 110000);

        // Displaying the map
        System.out.println("Initial Map: " + carsMap);

        // Accessing a value by key
        int value = carsMap.get("Audi");
        System.out.println("Value for 'Audi': " + value);

        // Checking if a key exists
        boolean hasBMW = carsMap.containsKey("BMW");
        System.out.println("Map contains 'BMW': " + hasBMW);

        // Removing a key-value pair
        carsMap.remove("Mercedes");
        System.out.println("Map after removing 'Mercedes': " + carsMap);

        // Iterating over the map entries
        System.out.println("Iterating over map entries:");
        // Entry is an inner interface of Map interface
        for (Map.Entry<String, Integer> entry : carsMap.entrySet()) { // you can access the key and value using entry object. we use entry.getKey() and entry.getValue() methods for that
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Altering a value
        carsMap.put("BMW", 95000); // updating the value for key "BMW
        carsMap.replace("Audi", 300000); // replacing the value for key "Audi"
        System.out.println("Map after updating values: " + carsMap);


        // Create a LinkedHashMap 
        LinkedHashMap<String, Integer> linkedCarsMap = new LinkedHashMap<>(); 
        linkedCarsMap.put("BMW", 100000);
        linkedCarsMap.put("Audi", 90000);
        linkedCarsMap.put("Mercedes", 110000);
        System.out.println("LinkedHashMap: " + linkedCarsMap);

        // Create a TreeMap
        TreeMap<String, Integer> treeCarsMap = new TreeMap<>();
        treeCarsMap.put("BMW", 100000);
        treeCarsMap.put("Audi", 90000);
        treeCarsMap.put("Mercedes", 110000);
        System.out.println("TreeMap: " + treeCarsMap);
        System.out.println("Descending TreeMap: " + treeCarsMap.descendingMap());
        System.out.println("First Entry in TreeMap: " + treeCarsMap.firstEntry());
        System.out.println("Last Entry in TreeMap: " + treeCarsMap.lastEntry());
        System.out.println("Key Set in TreeMap: " + treeCarsMap.keySet());
        System.out.println("Values in TreeMap: " + treeCarsMap.values());
    }
}
