import java.util.Arrays;

public class ArrayDataType {
    public static void main(String[] args) {
        // Declaration and instantiation done in single statement
        int numbers1[] = new int[5]; 
        // Initializing array elements
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;
        numbers1[3] = 40;
        numbers1[4] = 50;
        System.out.println("numbers1:" + Arrays.toString(numbers1));
        System.out.println("Length of numbers1: " + numbers1.length);

        // Declaration, instantiation, and initialization done in single statement
        int[] numbers2 = {1, 2, 3}; 
        System.out.println("numbers2:" + Arrays.toString(numbers2));
        System.out.println("Length of numbers2: " + numbers2.length);

        // Declaration, instantiation and initialization done in separate statements
        int numbers3[]; // Declaration
        numbers3 = new int[5]; // Instantiation
        // Initialization
        numbers3[0] = 10; 
        numbers3[1] = 20;
        numbers3[2] = 30;
        numbers3[3] = 40;
        // If you don't initialize, default value is 0. So, here, numbers3[4] = 50;
        System.out.println("numbers3:" + Arrays.toString(numbers3));
        System.out.println("Length of numbers3: " + numbers3.length);

        // Creating an array having elements of different data types using Object class
        Object mixedArray[] = {21, 9.0, "Hello", 'A', true};
        System.out.println("mixedArray:" + Arrays.toString(mixedArray));
        System.out.println("Length of mixedArray: " + mixedArray.length);

        int numbers[] = {100, 5, 10, 1, 23, 57};
        Arrays.sort(numbers); // Sorting the array
        System.out.println("Sorted numbers:" + Arrays.toString(numbers));

        String strings[] = {"3", "300", "20", "35", "37", "31", "4", "70", "ant", "Zebra"};
        Arrays.sort(strings); // Sorting the array
        System.out.println("Sorted strings:" + Arrays.toString(strings));

        //searching for an element in the array
        int index1 = Arrays.binarySearch(numbers, 23);
        System.out.println("Index of 23 in numbers array: " + index1);
        int index2 = Arrays.binarySearch(numbers, 50);
        System.out.println("Index of 50 in numbers array: " + index2); // returns negative value if not found. Value returned = -(index where it would be inserted) - 1. So, here it would be inserted at index 4, so returns -5
        int index3 = Arrays.binarySearch(numbers, 99);
        System.out.println("Index of 99 in numbers array: " + index3); // returns negative value if not found
    }
}
