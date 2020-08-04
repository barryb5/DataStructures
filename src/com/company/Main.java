package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        //Stack stack = new Stack(10);
        //Queue queue = new Queue(10);
        //LinkedList list = new LinkedList();

//        while (playing)
//        {
//            System.out.println("Do you want to Push, Pop, Print or Leave the Stack?");
//            String output = scanner.nextLine();
//            String[] choice = output.split("\\s+");
//            if (choice[0].equals("Push") || choice[0].equals("push"))
//            {
//                try {
//                    Integer.parseInt(choice[1]);
//                } catch (NumberFormatException E) {
//                    System.out.println(E);
//                }
//                int pushed = Integer.parseInt(choice[1]);
//                stack.Push(pushed);
//            }
//            else if (choice[0].equals("Pop") || choice[0].equals("pop"))
//            {
//                stack.Pop();
//            }
//            else if (choice[0].equals("Print") || choice[0].equals("print"))
//            {
//                stack.PrintStack();
//            }
//            else if (choice[0].equals("Leave") || choice[0].equals("leave"))
//            {
//                playing = false;
//            }
//            else
//            {
//                System.out.println("Please enter a command.");
//            }
//        }
//
//        playing = true;
//
//        while (playing)
//        {
//            System.out.println("Do you want to Push, Pop, Print or Leave the Queue?");
//            String output = scanner.nextLine();
//            String[] choice = output.split("\\s+");
//            if (choice[0].equals("Push") || choice[0].equals("push"))
//            {
//                try {
//                    Integer.parseInt(choice[1]);
//                } catch (NumberFormatException E) {
//                    System.out.println(E);
//                }
//                int pushed = Integer.parseInt(choice[1]);
//                queue.Push(pushed);
//            }
//            else if (choice[0].equals("Pop") || choice[0].equals("pop"))
//            {
//                queue.Pop();
//            }
//            else if (choice[0].equals("Print") || choice[0].equals("print"))
//            {
//                queue.PrintQueue();
//            }
//            else if (choice[0].equals("Leave") || choice[0].equals("leave"))
//            {
//                playing = false;
//            }
//            else
//            {
//                System.out.println("Please enter a command.");
//            }
//        }
//
//        playing = true;
//
//        while (playing)
//        {
//            System.out.println("Do you want to Add, Remove, make a NewHead, Print or Leave the Linked List?");
//            String output = scanner.nextLine();
//            String[] choice = output.split("\\s+");
//            if (choice[0].equals("Add") || choice[0].equals("add"))
//            {
//                try {
//                    Integer.parseInt(choice[1]);
//                } catch (NumberFormatException E) {
//                    System.out.println(E);
//                }
//                int pushed = Integer.parseInt(choice[1]);
//                list.Add(pushed);
//            }
//            else if (choice[0].equals("Remove") || choice[0].equals("remove"))
//            {
//                try {
//                    Integer.parseInt(choice[1]);
//                } catch (NumberFormatException E) {
//                    System.out.println(E);
//                }
//                int node = Integer.parseInt(choice[1]);
//                list.RemoveNode(node);
//            }
//            else if (choice[0].equals("NewHead") || choice[0].equals("Newhead") || choice[0].equals("newHead") || choice[0].equals("newhead"))
//            {
//                try {
//                    Integer.parseInt(choice[1]);
//                } catch (NumberFormatException E) {
//                    System.out.println(E);
//                }
//                int node = Integer.parseInt(choice[1]);
//                list.NewHead(node);
//            }
//            else if (choice[0].equals("Print") || choice[0].equals("print"))
//            {
//                list.Print();
//            }
//            else if (choice[0].equals("Leave") || choice[0].equals("leave"))
//            {
//                playing = false;
//            }
//            else
//            {
//                System.out.println("Please enter a command.");
//            }
//        }
        BinaryTree tree = new BinaryTree();
        tree.Insert(6);
        tree.Insert(4);
        tree.Insert(8);
        tree.Insert(10);
        tree.Insert(2);
        tree.Insert(3);
        tree.Insert(5);
        tree.Insert(7);
        tree.Insert(17);
        tree.Insert(13);
        tree.Insert(15);
        tree.Find(15);

    }
}
