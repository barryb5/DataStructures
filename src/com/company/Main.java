package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        Stack stack = new Stack(10);
        Queue queue = new Queue(10);

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

        LinkedList list = new LinkedList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
    }
}
