
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author Anthony Dominguez <Anthony.Dominguez at adominguez15722@gmail.com>
 */
import java.util.Random;

public class HiddenNuts {
    public static void main(String[] args) {
        String[] hidingSpots = new String[100];
        System.out.println("The nut has been hidden ...");
        Random squirrel = new Random();
        int upperbound = hidingSpots.length;
        hidingSpots[squirrel.nextInt(upperbound)] = "Nut";
        for (int i = 0; i < hidingSpots.length; i++) {
            if(hidingSpots[i] != null) {
                System.out.println("Found it! It's in spot#" + i);
            }
        }
    }
}
