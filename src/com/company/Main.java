package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        Stack stack = new Stack(10);

        while (playing == true)
        {
            System.out.println("Do you want to Push, Pop, Peek, Print or Leave?");
            String choice = scanner.nextLine();
            if (choice == "Push" || choice == "push")
            {
                System.out.println("What number will you push?");
                int pushed = scanner.nextInt();
                stack.Push(pushed);
            }
            else if (choice == "Pop" || choice == "pop")
            {
                stack.Pop();
            }
            else if (choice == "Peek" || choice == "peek")
            {
                stack.Peek();
            }
            else if (choice == "Print" || choice == "print")
            {
                stack.PrintStack();
            }
            else if (choice == "Leave" || choice == "leave")
            {
                playing = false;
            }
            else
            {
                System.out.println("Please enter a command.");
            }
        }
    }

}
