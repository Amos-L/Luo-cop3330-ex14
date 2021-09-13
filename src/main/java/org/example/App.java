/*
 *  UCF COP3330 Fall 2021 Assignment 1.14 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class App
{
    static final double TAXRATE = 0.055;
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the order amount? "); //Asking for user input
        double amount = x.nextDouble(); //Storing user input
        Scanner y = new Scanner(System.in);
        System.out.print("What is the state? ");
        String state = y.nextLine();

        double taxed = amount * TAXRATE;
        double total = taxed + amount;

        double roundedtotal = Math.round(total * 100)/100.0; //rounding to the nearest penny
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //Formats into currency
        DecimalFormat nodec = new DecimalFormat("#0"); //Takes 0's after double

        if(state.equals("WI"))
        {
            System.out.println("The subtotal is " +currency.format(amount)+ ". \nThe tax is " +currency.format(taxed)+ ".\nThe total is " +currency.format(roundedtotal)+ ".");
            return; //Returns after printing this line and not going to next
        }
        System.out.println("The total is " +currency.format(amount)+ "."); //The "else" statement
    }
}