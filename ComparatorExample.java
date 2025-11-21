import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Priya", 3));
        list.add(new Student("Arjun", 1));
        list.add(new Student("Kiran", 2));

        // Sorting by age
        Collections.sort(list, new sortById());
        System.out.println("Sorted by age:");
        for (Student s : list) {
            System.out.println(s.name + " - " + s.age);
        }

        // Sorting by name
        Collections.sort(list, new sortByName());
        System.out.println("Sorted by name:");
        for (Student s : list) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}

// This comparator sorts students by their age in ascending order
class sortById implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.age - b.age;
    }
}

// This comparator sorts students by their name in alphabetical order
class sortByName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}