package com.bridgelabz;

public class Stack<T> {
    // LIFO
    LinkedList linkedList = new LinkedList();
    // Push : Adding elements
    public void push(T data) {
        linkedList.addFirst(data);
    }
    // Pop : Deleting elements
    public void pop() {
        linkedList.deleteFirst();
    }
    // TO display
    public void displayStack() {
        linkedList.printList();
    }
}
