package com.company;

public class BinaryTree {
    public static class Branch
    {
        public int value;

        public Branch(int value)
        {
            this.value = value;
            this.left = null;
            this.right = null;
        }

    };

    Branch root;

    BinaryTree(int value) {
        root = new Branch(value);
    }

    BinaryTree() {
        root = null;
    }

}
