package com.bridgelabz;

public class Queue<T> {
    // FIFO
    LinkedList linkedList = new LinkedList();
    // Adding elements: Enqueue
    public void enque(T data) {
        linkedList.addLast(data);
        displayQueue();
    }
    // Deleting elements: Dequeue
    public void deque() {
        linkedList.deleteFirst();
        displayQueue();
    }
    // to display
    public void displayQueue() {
        linkedList.printList();
    }
}
