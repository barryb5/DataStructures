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
        root = new Branch(0);
    }

    public void Insert(int value) {

        Branch b = root;

        while (true) {
            if (b.value == 0) {
                b.value = value;
                return;
            }
            else if (value < b.value) {
                if (b.left == null) {
                    b.left = new Branch(value);
                    return;
                }
                b = b.left;
            }
            else if (value > b.value) {
                if (b.right == null) {
                    b.right = new Branch(value);
                    return;
                }
                b = b.right;
            }
            else if (value == b.value) {
                if (b.right == null) {
                    b.right = new Branch(value);
                    return;
                }
                b = b.right;
            }
            else {
                System.out.printf("\nSomething went wrong I don't know what.\n");
                return;
            }
        }
    }

    public void Find(int num) {

        Branch b = root;

        int steps = 0;

        while (true) {
            if (b.value == 0) {
                System.out.printf("\nNull\n");
                return;
            }
            else if (num < b.value) {
                if (num == b.left.value) {
                    System.out.printf("\n%d, took %d steps\n", num, steps + 1);
                    return;
                }
                b = b.left;
            }
            else if (num > b.value) {
                if (num == b.right.value) {
                    System.out.printf("\n%d, took %d steps\n", num, steps + 1);
                    return;
                }
                b = b.right;
            }
            else if (num == b.value) {
                if (b.right == null) {
                    System.out.printf("\n%d, took %d steps\n", num, steps + 1);
                    return;
                }
                b = b.right;
            }
            else {
                System.out.printf("\nSomething went wrong I don't know what.\n");
                return;
            }
            steps++;
        }

    }

    public void Print(int space) {
        if (root == null) {
            System.out.printf("\nNothing to print.\n");
            return;
        }
    }
}
