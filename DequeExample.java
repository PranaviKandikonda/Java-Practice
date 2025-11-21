import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the front and back
        deque.add("Task 0"); // adds element to the end by default
        deque.addFirst("Task 1"); // adds element to the front of the deque
        deque.addLast("Task 2");
        deque.push("Task 3"); //adds element to the front of the deque
        deque.offer("Task 4"); // adds element to the end by default
        deque.offerFirst("Task 5"); // adds element to the front of the deque
        deque.offerLast("Task 6"); // adds element to the end of the deque

        System.out.println("Deque after additions: " + deque);

        // Removing elements from the front and back
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Deque after removing from front: " + deque);
        System.out.println("Removed from back: " + deque.removeLast());
        System.out.println("Deque after removing from back: " + deque);

        // Peeking at the front and back elements
        String front = deque.peekFirst();
        String back = deque.peekLast();
        System.out.println("Front element: " + front);
        System.out.println("Back element: " + back);
    }
}
