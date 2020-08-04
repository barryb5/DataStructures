package com.company;


public class LinkedList {
    public static class Node
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
    private int numOfNodes = 0;

    public LinkedList() {
        this.head = null;
    }

    public void Add(int value)
    {
        Node n = new Node(value);

        if (this.head == null) {
            head = n;
            numOfNodes = 1;
        }
        else
        {
            Node ptr = this.head;
            while(ptr.next != null)
                ptr = ptr.next;

            ptr.next = n;
            numOfNodes++;
        }
    }

    public void NewHead(int value) {
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
        numOfNodes++;
    }


    public void RemoveNode(int nodeNum) throws Exception {
        if (nodeNum > numOfNodes) {
            throw new Exception("Node you're trying to delete doesn't exist");
        }

        Node ptr = this.head;

        if (nodeNum == 1) {
            head = head.next;
            numOfNodes--;
            return;
        }
        nodeNum--;

        for (int i = 0; i < nodeNum; i++) {
            if (i == (nodeNum - 1)) {
                ptr.next = ptr.next.next;
                numOfNodes--;
            }
        }
    }


    public void Print() {
        Node n = this.head;
        for (int i = 0; i < numOfNodes; i++) {
            System.out.printf("%d ", n.value);
            n = n.next;
        }
        System.out.printf("\n");
    }
}
