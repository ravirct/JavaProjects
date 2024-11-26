package Sample;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        // Create a LinkedList as a Queue
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        System.out.println("Queue: " + queue);

        // Remove the front element (FIFO)
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Queue after polling: " + queue);

        // Peek at the front element
        System.out.println("Peek element: " + queue.peek());
        System.out.println("Queue after polling: " + queue);
    }
}
