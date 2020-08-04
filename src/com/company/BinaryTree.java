package com.company;

public class BinaryTree {
    public static class Branch
    {
        public int value;
        Branch left, right;

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

    public void Insert(int value, int[] instructions) {

        Branch b = root;

        if (instructions.length <= 0) {
            System.out.printf("\nInstructions unclear\n");
            return;
        }

        int i = 1;

        while (true) {
            if (instructions[i] == 0) {
                if (b.left == null) {
                    b.left = new Branch(value);
                    return;
                }
                b = b.left;
            }
            else if (instructions[i] == 1) {
                if (b.right == null) {
                    b.right = new Branch(value);
                    return;
                }
                b = b.right;
            }
            else {
                System.out.printf("\nInstructions unclear\n");
                return;
            }
        }
    }

    public void Print(int space) {
        if (root == null) {
            System.out.printf("\nNothing to print.\n");
            return;
        }
    }
}
