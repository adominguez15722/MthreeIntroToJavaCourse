
package com.sg.foundations.flowcontrol.arrays;

import java.util.Scanner;

/**
 *
 * @author Anthony Dominguez <Anthony.Dominguez at adominguez15722@gmail.com>
 */
public class LuckySevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many dollars do you have?");
        int amount = scanner.nextInt();
        int count = 0;
        int profit = amount;
        int profitCount = 0;
        double sum = 0;
        while (amount > 0) {
            double rollOne = Math.round(Math.random() * (6 - 1) + 1);
            double rollTwo = Math.round(Math.random() * (6 - 1) + 1);
            if(rollOne + rollTwo == 7) {
                if (profit <= amount) {
                    profitCount = count;
                    profit +=4;
                }
                amount += 4;
                count +=1;
            } else {
                amount -= 1;
                count +=1;
            }
        }
        System.out.println("You are broke after " + count + " rolls.");
        System.out.println("You should have quit after " + profitCount + " rolls when you had $" + profit);
    }
}
