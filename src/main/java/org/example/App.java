/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double order_amount, tax, final_amount, tax_ratio ;
        String state, county;

        System.out.print("What is the order amount? ");
        order_amount = user_input.nextDouble();
        user_input = new Scanner(System.in);
        System.out.print("What state do you live in? ");
        state = user_input.nextLine();
        System.out.print("What county do you live in? ");
        county = user_input.nextLine();

        if(state.equalsIgnoreCase("wisconsin"))
        {
            if (county.equalsIgnoreCase("eau claire"))
            {
                tax_ratio = 0.055;
            }
            else if (county.equalsIgnoreCase("dunn"))
            {
                tax_ratio = 0.054;
            }
            else
            {
                tax_ratio = 0.05;
            }
        }
        else if (state.equalsIgnoreCase("illinois"))
            {
                tax_ratio = 0.08;
            }
        else
            {
                tax_ratio = 0;
            }

        tax = (order_amount * tax_ratio);
        final_amount = (order_amount + tax);

        System.out.println(String.format("The tax is $%.2f.\nThe total is $%.2f.",tax,final_amount));
    }
}
