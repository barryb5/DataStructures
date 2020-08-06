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

    public void Insert(int value) {

        Branch b = root;

        if(root == null) {
            root = new Branch(value);
            return;
        }

        while (true) {
            if (value < b.value) {
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

        if (root == null) {
            System.out.printf("\nNull\n");
            return;
        }

        int steps = 0;

        while (true) {
            if (num < b.value) {
                if (num == b.left.value) {
                    System.out.printf("\n%d, took %d steps\n", num, steps + 1);
                    return;
                }
                if (b.left == null) {
                    System.out.printf("\nNum not found\n");
                }
                b = b.left;
            }
            else if (num > b.value) {
                if (num == b.right.value) {
                    System.out.printf("\n%d, took %d steps\n", num, steps + 1);
                    return;
                }
                if (b.right == null) {
                    System.out.printf("\nNum not found\n");
                }
                b = b.right;
            }
            else if (num == b.value) {
                System.out.printf("\n%d, took %d steps\n", num, steps);
                return;
            }
            else {
                System.out.printf("\nSomething went wrong I don't know what.\n");
                return;
            }
            steps++;
        }

    }

    public String TraversePreOrder(Branch root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.value);

        String pointerRight = "└──";
        String pointerLeft = (root.right != null) ? "├──" : "└──";

        TraverseNodes(sb, "", pointerLeft, root.left, root.right != null);
        TraverseNodes(sb, "", pointerRight, root.right, false);

        return sb.toString();
    }

    public void TraverseNodes(StringBuilder sb, String padding, String pointer, Branch node,
                              boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.value);

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.right != null) ? "├──" : "└──";

            TraverseNodes(sb, paddingForBoth, pointerLeft, node.left, node.right != null);
            TraverseNodes(sb, paddingForBoth, pointerRight, node.right, false);
        }
    }

    public void Print() {
        if (root == null) {
            System.out.printf("\nNothing to print.\n");
            return;
        }
        System.out.printf("%s", TraversePreOrder(root));
        System.out.printf("\n");
    }
}
