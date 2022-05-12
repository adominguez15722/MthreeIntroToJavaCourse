
package com.sg.foundations.flowcontrol.arrays;

import java.util.Scanner;


/**
 *
 * @author Anthony Dominguez <Anthony.Dominguez at adominguez15722@gmail.com>
 */
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much do you want to invest? ");
        float principal = scanner.nextFloat();
        System.out.print("How many years are you investing? ");
        float years = scanner.nextFloat();
        System.out.print("What is the annual interest rate % growth?");
        float interest = scanner.nextFloat();
        float quarterlyInterest = interest/4;
        System.out.println("Calculating...");
        float balance = principal;
        float earnedAmount = 0;
        
        for(int i = 1; i <= years; i++){
            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + Math.round(balance * 100.00) / 100.00);
            for (int j = 0; j < 4; j++) {
                balance = principal * (1 + (quarterlyInterest/100));
                earnedAmount += balance - principal;
                principal = balance;
            }
            System.out.println("Earned $" + Math.round(earnedAmount * 100.0) /100.0);
            earnedAmount = 0;
            System.out.println("Ended with $" + Math.round(balance * 100.0) /100.0 + "\n");
            principal = balance;            
        }
    }
}
