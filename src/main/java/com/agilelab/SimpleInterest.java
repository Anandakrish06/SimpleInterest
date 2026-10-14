
package com.agilelab;

public class SimpleInterest {

    public static double calculate(
            double principal, double rate, double time) {

        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException(
                    "Values cannot be negative");
        }

        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 2;

        double interest = calculate(principal, rate, time);

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount: "
                + (principal + interest));
    }
}
