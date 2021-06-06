/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package base;

import java.util.Scanner;

/*
Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in
euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.

The formula for currency conversion is derived from

c_to / c_frame = rate

where

c_to is the amount in U.S. dollars.
c_from is the amount in euros.
rate is the per-unit current exchange rate from c_from to c_to.

Example Output

How many euros are you exchanging? 81
What is the exchange rate? 1.3751
81 euros at an exchange rate of 1.3751 is
111.38 U.S. dollars.

Constraints

Ensure that fractions of a cent are rounded up to the next penny.
Use a single output statement.

Challenges

Build a dictionary of conversion rates and prompt for the countries instead of the rates.
Wire up your application to an external API that provides the current exchange rates.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int euros = readEuroAmount();
        float rate = currentExchangeRate();
        float dollarsUS = getUSDollarAmount(euros, rate);
        generateOutput(euros, rate, dollarsUS);
    }

    private static void generateOutput(int euros, float rate, float dollarsUS) {
        System.out.println(String.format("How many euros are you exchanging? %d" +
                                        "\nWhat is the exchange rate? %.4f\n%d euros " +
                                        "at an exchange rate of %.4f is" +
                                        "\n%.2f U.S. dollars.", euros, rate, euros, rate, dollarsUS));
    }

    private static float getUSDollarAmount(int euros, float rate) {
        return rate * euros;
    }

    private static float currentExchangeRate() {
        return in.nextFloat();
    }

    private static int readEuroAmount() {
        return in.nextInt();
    }
}
