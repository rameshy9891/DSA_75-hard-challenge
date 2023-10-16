package com.masai.dayseventeen;

import java.util.Scanner;

public class RightToVote2 {
    public static void main(String[] args) {
        System.out.print("Please enter your budget: \n");
        Scanner sc = new Scanner(System.in);
        double budget = sc.nextDouble();

        // Define item prices
        double tShirtPrice = 50.00;
        double jeansPrice = 80.00;
        double jacketPrice = 100.00;

        int maxTShirts = (int) (budget / tShirtPrice);
        int maxJeans = (int) (budget / jeansPrice);

        for (int tShirts = 1; tShirts <= maxTShirts; tShirts++) {
            for (int jeans = 1; jeans <= maxJeans; jeans++) {
                double remainingBudget = budget - (tShirts * tShirtPrice + jeans * jeansPrice);

                if (remainingBudget >= jacketPrice) {
                    int jackets = (int) (remainingBudget / jacketPrice);
                    double newBudget = remainingBudget - (jackets * jacketPrice);

                    if (jackets >= 1 && newBudget < 50.00) {
                        System.out.println("T-shirts: " + tShirts +
                                ", Jeans: " + jeans +
                                ", Jackets: " + jackets);
                    }
                }
            }
        }
    }
}

