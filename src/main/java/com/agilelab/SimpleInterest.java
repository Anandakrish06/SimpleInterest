
package com.agilelab;

import java.util.Scanner;

public class SimpleInterest {

    public static double calculate(
            double principal, double rate, double time) {

        if (!Double.isFinite(principal)
                || !Double.isFinite(rate)
                || !Double.isFinite(time)
                || principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException(
                    "Values must be non-negative numbers.");
        }

        return principal * rate * time / 100.0;
    }

    public static void main(String[] args) {
        try {
            double principal, rate, time;

            if (args.length == 3) {
                principal = Double.parseDouble(args[0]);
                rate = Double.parseDouble(args[1]);
                time = Double.parseDouble(args[2]);
            } else {
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.print("Enter Principal Amount: ");
                    principal = Double.parseDouble(sc.nextLine());

                    System.out.print("Enter Rate of Interest: ");
                    rate = Double.parseDouble(sc.nextLine());

                    System.out.print("Enter Time (in years): ");
                    time = Double.parseDouble(sc.nextLine());
                }
            }

            double interest = calculate(principal, rate, time);

            System.out.println("Simple Interest: " + interest);
            System.out.println("Total Amount: "
                    + (principal + interest));

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numeric values.");
            System.exit(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}
