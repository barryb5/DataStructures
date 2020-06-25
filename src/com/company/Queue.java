package com.company;

public class Queue {
    int[] queue;
    int size;
    int start;
    int end;
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
    }
}
