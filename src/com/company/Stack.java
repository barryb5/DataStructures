package com.company;

import java.util.*;


public class Stack {
    /**
     * Default Constructor
     * @param size - size of the stack
     */
    public Stack(int size)
    {
        Stack stack = new Stack(size);
    }

    /**
     * Pushes an integer to the stack
     * @param x - item to be pushed into stack
     */
    public void Push(Stack stack, int x)
    {
        stack.push(x);
    }

    public int Pop(Stack stack)
    {
        int popped = stack.pop();
        return popped;
    }

    public int Peek(Stack stack)
    {
        int peeked = stack.peek();
        return peeked;
    }

    public boolean IsEmpty(Stack stack)
    {
        boolean empty = stack.empty();
        return empty;
    }
}
