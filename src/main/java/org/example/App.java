/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Scanner stateSc = new Scanner(System.in);
        float rate = 5.5F;

        System.out.println("What is the order amount?");
        float orderAmount = sc.nextFloat();
        System.out.println("What is the state?");
        String state = stateSc.nextLine();

        if (state.equals("WI") || state.equals("wi"))
        {
            float tax = (rate/100) * orderAmount;
            float total = orderAmount + tax;
            System.out.printf("The subtotal is: $%.2f\nThe tax is: %.2f\nThe total is: $%.2f", orderAmount,
                    tax, total);
        }
        else
        {
            System.out.printf("The total is %.2f", orderAmount);
        }
    }
}
