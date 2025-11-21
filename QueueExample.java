import java.util.*;

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class QueueExample {
    public static void main(String[] args) {
        // implemenating priority queue using custom comparator
        // Comparator: smaller priority value = higher importance
        PriorityQueue<Task> pq = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority)); // we are comparing based on the attribute 'priority'

        pq.add(new Task("Email", 3));
        pq.add(new Task("Assignment", 1));
        pq.add(new Task("Meeting", 2));

        while (!pq.isEmpty()) {
            System.out.println("Processing: " + pq.poll());
        }


        /* 
        // max Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("Max Priority Queue: " + pq);

        System.out.println("Head element (max): " + pq.peek());

        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }

    
        // implementing Queue using PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();

        // Adding elements to the queue
        queue.add(30); // throws exception if fails
        queue.add(10);
        queue.add(20);
        queue.offer(40); // returns false if fails. does not throw exception
        queue.offer(50);
        System.out.println("Queue after adding elements: " + queue);

        // Size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Removing elements from the queue
        // You can see that even though we added elements in random order, they are removed in ascending order.
        System.out.println("Removed element: " + queue.remove()); // throws exception if queue is empty
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Removed element: " + queue.remove());
        System.out.println("Removed element using poll: " + queue.poll()); // returns null if queue is empty
        System.out.println("Removed element using poll: " + queue.poll());
        System.out.println("Queue after removing elements: " + queue);

        /* 
        // implementing Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(10); // throws exception if fails
        queue.add(20);
        queue.add(30);
        queue.offer(40); // returns false if fails. does not throw exception
        queue.offer(50);
        System.out.println("Queue after adding elements: " + queue);

        // Size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Removing elements from the queue
        System.out.println("Removed element: " + queue.remove()); // throws exception if queue is empty
        System.out.println("Removed element using poll: " + queue.poll()); // returns null if queue is empty
        System.out.println("Queue after removing elements: " + queue);

        // Peeking at the front element.
        System.out.println("Front element: " + queue.element()); // throws exception if queue is empty
        System.out.println("Front element: " + queue.peek()); // returns null if queue is empty
        */
    }
}
