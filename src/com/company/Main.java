package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static ArrayList<Customer> people = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner inputNums = new Scanner(System.in);
        top: while(true)
        {
            System.out.println("What is your name?");
            String name = input.nextLine();
            for(int i = 0; i < people.size(); i++)
            {
                if(name.equalsIgnoreCase(people.get(i).name))
                {
                    enterSession(people.get(i));
                    continue top;
                }
            }
            if(name.equalsIgnoreCase("exit"))
                break;
            System.out.println("What is your weight?");
        }
    }

    public static void enterSession(Customer cust)
    {

    }
}
