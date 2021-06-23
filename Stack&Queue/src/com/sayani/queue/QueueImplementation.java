package com.sayani.queue;

public class QueueImplementation {
    Node front = null;
    Node rear = null;

    public void enqueue (int item) {
        Node node = new Node();
        node.data = item;
        if(front == null) {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
    }

    public void dequeue() {
        if (front == null)
            System.out.println("\n" + "Queue Underflow");

        Node temp = front;
        System.out.printf("Removing %d\n", temp.data);
        front = front.next;

        if (front == null)
            rear = null;

    }

    public void display() {
        if(front == null)
            System.out.println("Stack is Empty");
        else {
            Node temp = front;
            while(temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
