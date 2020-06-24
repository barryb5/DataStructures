package com.company;

import java.util.*;


public class Stack {
    /**
     * initialize the stack, size of stack, and index
     */
    int[] stack;
    int size;
    int index;
    /**
     * Default Constructor
     * @param sz - size of the stack
     */
    public Stack(int sz)
    {
        stack = new int[sz];
        size = sz;
        index = 0;
    }

    /**
     * Pushes an integer to the stack
     * @param x - item to be pushed into stack
     */
    public boolean Push(int x)
    {
        if (index >= size) {
            return false;
        }
        stack[index] = x;
        ++index;
        return true;
    }

    public boolean Pop()
    {
        if (index <= 0)
        {
            return false;
        }
        stack[index - 1] = 0;
        --index;
        return true;
    }

    public int Peek()
    {
        return stack[index - 1];
    }

    public void PrintStack()
    {
        for (int i = 0; i < size; ++i)
        {
            System.out.printf("%d ", stack[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < size; ++i)
        {
            System.out.printf("--", stack[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < size; ++i)
        {
            System.out.printf("%d ", i);
        }
    }

    public boolean IsEmpty()
    {
        if (index <=0 )
        {
            return true;
        }
        return false;
    }
}
