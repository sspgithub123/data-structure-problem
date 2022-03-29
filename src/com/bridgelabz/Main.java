package com.bridgelabz;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");
        LinkedList list = new LinkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.printList();
        list.addLast(4);
        list.printList();
        list.addFirst(1);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println("-------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("Welcome to Queue Program");
        Queue queue = new Queue();
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.deque();
        queue.deque();
        queue.deque();
        System.out.println("-------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("Welcome to Stack Program");
        Stack stack = new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.displayStack();
        stack.pop();
        stack.displayStack();
        stack.pop();
        stack.displayStack();
        stack.pop();
        stack.displayStack();
        System.out.println("-------------------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
