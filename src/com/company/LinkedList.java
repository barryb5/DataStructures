package com.company;


public class LinkedList {
    public class Node
    {
        public int value;
        public Node next;

        public Node(int value)
        {
            this.value = value;
            this.next = null;
        }

    };

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int value)
    {
        Node n = new Node(value);

        if (this.head == null)
            head = n;
        else
        {
            Node ptr = this.head;
            while(ptr.next != null)
                ptr = ptr.next;

            ptr.next.next = n;
        }
    }
}
