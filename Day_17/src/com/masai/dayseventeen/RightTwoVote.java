package com.masai.dayseventeen;
import java.util.Scanner;

public class RightTwoVote {
    public static void main(String[] args) {
        // Input budget
        System.out.print("Please enter your budget: \n");
        Scanner sc = new Scanner(System.in);
        double budget = sc.nextDouble();

        // Define item prices
        double tShirtPrice = 50.00;
        double jeansPrice = 80.00;
        double jacketPrice = 100.00;

        // Calculate maximum quantity of each item
        int maxTShirts = (int) (budget / tShirtPrice);
        int maxJeans = (int) (budget / jeansPrice);
        int maxJackets = (int) (budget / jacketPrice);

        // Loop through combinations
        for (int tShirts = 1; tShirts <= maxTShirts; tShirts++) {
            for (int jeans = 1; jeans <= maxJeans; jeans++) {
                for (int jackets = 1; jackets <= maxJackets; jackets++) {
                    // Calculate the total cost for the current combination
                    double totalCost = tShirts * tShirtPrice + jeans * jeansPrice + jackets * jacketPrice;

                    
                    if (totalCost > budget) {
                        break;  // No need to continue the inner loop
                    }
                    
                    
                    // Check if the combination is valid
                    if (totalCost <= budget && tShirts >= 1 && jeans >= 1 && jackets >= 1 && totalCost >= (budget - 50)) {
                        System.out.println("T-shirts: " + tShirts +
                                ", Jeans: " + jeans +
                                ", Jackets: " + jackets);
                    }
                }
            }
        }
    }
}
