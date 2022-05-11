
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author Anthony Dominguez <Anthony.Dominguez at adominguez15722@gmail.com>
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        String color = getRandomColor();
        String animal = getRandomAnimal();
        String colorAgain = getRandomColor();
        int weight = getRandomNumber(5, 200);
        int distance = getRandomNumber(10, 20);
        int number = getRandomNumber(10000, 20000);
        int time = getRandomNumber(2, 6);
        
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
        public static String getRandomColor() {
        String[] colors = new String[]{"red", "green", "blue", "yellow", "black"};
        int answer = new Random().nextInt(colors.length);                
        return colors[answer];
    }
    
    public static String getRandomAnimal() {
        String[] animals = {"lion", "bear", "tiger", "elephant", "leopard"};
        int answer = new Random().nextInt(animals.length);
        return animals[answer];
    }
    
    public static int getRandomNumber(int min, int max) {
        int answer = new Random().nextInt(max - min) + min;
        return answer;
    }
}
    
    
