package com.company;

public class Queue {
    int[] queue;
    int size;
    int start;
    int end;
    int total;
    /**
     * Default Constructor
     * @param sz - size of the stack
     */
    public Queue(int sz)
    {
        queue = new int[sz];
        size = sz;
        start = 0;
        end = 0;
        total = 0;
    }

    public boolean Push(int x) throws Exception {
        if (total >= size) {
            throw new Exception("Queue is full");
        }
        else {
            end = end % size;
            queue[end] = x;
            ++end;
            ++total;
            return true;
        }
    }
    public boolean Pop() throws Exception {
        if (total <= 0) {
            throw new Exception("Cannot pop empty queue");
        }
        else {
            start = start % size;
            queue[start] = 0;
            ++start;
            --total;
            return true;
        }
    }

    public void PrintQueue()
    {
        for (int i = start; i < (size + start); ++i)
        {
            System.out.printf("%d ", queue[i % size]);
        }
        System.out.printf("\n");
        for (int i = 0; i < size; ++i)
        {
            System.out.printf("--");
        }
        System.out.printf("\n");
        for (int i = 0; i < size; ++i)
        {
            System.out.printf("%d ", i);
        }
        System.out.printf("\n");
    }
}
