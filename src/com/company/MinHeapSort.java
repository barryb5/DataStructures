package com.company;

import org.w3c.dom.Node;

import java.util.Arrays;

public class MinHeapSort
{
    private int capacity = 10;
    private int size = 0;

    int getLeftChildIndex(int parentIndex) {return  2 * parentIndex + 1;}
    int getRightChildIndex(int parentIndex) {return  2 * parentIndex + 2;}
    int getParentIndex(int childIndex) {return  (childIndex - 1) / 2;}

    boolean hasLeftChild(int index) {return getLeftChildIndex(index) < size;}
    boolean hasRightChild(int index) {return getRightChildIndex(index) < size;}
    boolean hasParent(int index) {return getParentIndex(index) >= 0;}

    int leftChild(int index) {return items[getLeftChildIndex(index)];}
    int rightChild(int index) {return items[getRightChildIndex(index)];}
    int parent(int index) {return items[getParentIndex(index)];}

    int[] items = new int[capacity];


    private void swap(int a, int b) {
        int temp = items[a];
        items[a] = items[b];
        items[b] = temp;
    }

    private void checkCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }
    public int peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return items[0];
    }

    public int poll() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        int item = items[0];
        items[0] = items[size - 1];
        BubbleDown();
        return item;
    }

    public void Insert(int value) {
        checkCapacity();
        items[size] = value;
        size++;
        BubbleUp();
    }

    public void BubbleDown() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void BubbleUp() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (items[index] < items[smallerChildIndex]) {
                break;
            }
            else {
                swap(index, smallerChildIndex);
            }

            index = smallerChildIndex;
        }
    }



}

