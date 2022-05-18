/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.classesandobjects;

import java.util.Scanner;

/**
 *
 * @author Anthony Dominguez <Anthony.Dominguez at adominguez15722@gmail.com>
 */
public class UserIOExercise {
    
    public interface UserIO {

    void print(String message);

    String readString(String prompt);

    int readInt(String prompt);

    int readInt(String prompt, int min, int max);

    double readDouble(String prompt);

    double readDouble(String prompt, double min, double max);

    float readFloat(String prompt);

    float readFloat(String prompt, float min, float max);

    long readLong(String prompt);

    long readLong(String prompt, long min, long max);

}
    class Testing{
        Scanner scanner = new Scanner(System.in);
        public void print(String message) {
            System.out.println(message);
        }
        
        public String readString(String prompt) {
            System.out.println("Type something here: ");
            prompt = scanner.next();
            return prompt;
        }
        
        public Integer readInt(String prompt) {
            System.out.println("Enter any integer: ");
            int answer = scanner.nextInt();
            return answer;
        }
        
        public Integer readInt(String prompt, int min, int max) {
            System.out.println("Enter any integer between 1 and 10: ");
            min = 1;
            max =10;            
            int answer = scanner.nextInt();
            while(answer < min || answer > max) {
                System.out.println("Pick a number between 1 and 10");
            }
            return answer;
        }
    }
    
    
    
}
