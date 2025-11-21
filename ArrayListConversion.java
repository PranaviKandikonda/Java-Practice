import java.util.*;

public class ArrayListConversion {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-10);
        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("Original ArrayList: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);
    }

}