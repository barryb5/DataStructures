package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        Stack stack = new Stack(10);

        while (playing)
        {
            System.out.println("Do you want to Push, Pop, Peek, Print or Leave?");
            String choice = scanner.nextLine();
            if (choice.equals("Push") || choice.equals("push"))
            {
                System.out.println("What number will you push?");
                stack.Push(scanner.nextInt());
            }
            else if (choice.equals("Pop") || choice.equals("pop"))
            {
                stack.Pop();
            }
            else if (choice.equals("Print") || choice.equals("print"))
            {
                stack.PrintStack();
            }
            else if (choice.equals("Leave") || choice.equals("leave"))
            {
                playing = false;
            }
            else
            {
                System.out.println("Please enter a command.");
            }
        }

        playing = true;

        while (playing)
        {
            playing = false;
        }
    }

}
