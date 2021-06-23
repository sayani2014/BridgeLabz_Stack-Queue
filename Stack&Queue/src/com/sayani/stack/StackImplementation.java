package com.sayani.stack;

class StackImplementation {
    private Node top;

    public StackImplementation() {
        this.top = top;
    }

    public void push(int element) {
        Node node = new Node();
        node.data = element;
        if(node == null)
            node.next = null;
        else {
            node.next = top;
            top = node;
        }
    }
    void pop()
    {
        if(top == null)
            System.out.println("\n" + "Stack is Empty!");
        else{
            Node temp = top;
            System.out.printf("Deleted element: %d", temp.data);
            System.out.println();
            top = temp.next;
        }
    }

    public int peek() {
        if (top != null)
            return top.data;
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void display() {
        if(top == null)
            System.out.println("Stack is Empty");
        else {
            Node temp = top;
            while(temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
