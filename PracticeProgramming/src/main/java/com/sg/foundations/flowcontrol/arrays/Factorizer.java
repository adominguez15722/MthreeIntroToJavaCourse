
package com.sg.foundations.flowcontrol.arrays;

import java.util.Scanner;

/**
 *
 * @author Anthony Dominguez <Anthony.Dominguez at adominguez15722@gmail.com>
 */
public class Factorizer {
    public static void main(String[] args) {
        int sum = 0;
        int factors = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to factor? ");
        int number = scanner.nextInt();
        System.out.println("The factors of " + number + " are:");
        for(int i = 1; i <= number; i++) {
            if (((number/i) % 1) == 0 && number % i == 0) {
                System.out.print(i + " ");
                sum += i;
                factors++;                
            }
        }        
        System.out.println(" ");
        System.out.println(number + " has " + factors + " factors");
        if(sum - number == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        if (sum == number + 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
