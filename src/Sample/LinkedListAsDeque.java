package Sample;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsDeque {
    public static void main(String[] args) {
        // Create a LinkedList as a Deque
        Deque<String> deque = new LinkedList<>();

        // Add elements at both ends
        deque.addFirst("Start");
        deque.addLast("End");
        deque.addFirst("Begin");
        System.out.println("Deque: " + deque);

        // Remove elements from both ends
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from back: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);
    }
}
