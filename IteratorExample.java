import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 1;
        while(i < 51){
            numbers.add(i);
            i++;
        }
        System.out.println("Numbers from 1 to 50: " + numbers);

        /*
        // Using Iterator to traverse the list and remove multiples of 5
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            int num = it.next();
            if(num % 5 == 0){
                it.remove();
            }
        }
        System.out.println("Numbers after removing multiples of 5: " + numbers);
        */

        // Using ListIterator to traverse the list and replace multiples of 5 with -1
        ListIterator<Integer> listIt = numbers.listIterator();
        while(listIt.hasNext()){
            int num = listIt.next();
            if(num % 5 == 0){
                listIt.set(-1); // Replacing multiple of 5 with -1
            }
        }
        System.out.println("Numbers after replacing multiples of 5 with -1: " + numbers);

        // Using ListIterator to traverse the list in reverse order
        System.out.print("Numbers in reverse order: ");
        while(listIt.hasPrevious()){
            System.out.print(listIt.previous() + " ");
        }
    }
}