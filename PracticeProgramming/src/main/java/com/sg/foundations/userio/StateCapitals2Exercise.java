
package com.sg.foundations.userio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Anthony Dominguez <Anthony.Dominguez at adominguez15722@gmail.com>
 */
public class StateCapitals2Exercise {
    public static void main(String[] args) throws Exception {
        Map<String, String> states = new HashMap<>();
    
        states.put("Alabama", "Montgomery");
        states.put("Alaska", "Juneau");
        states.put("Arizona", "Phoenix");
        states.put("Arkansas", "Little Rock");
        states.put("California", "Sacramento");
        states.put("Colorado", "Denver");
        states.put("Connecticut", "Hartford");
        states.put("Delaware", "Dover");
        states.put("Florida", "Tallahassee");
        states.put("Georgia", "Atlanta");
        states.put("Hawaii", "Honolulu");
        states.put("Idaho", "Boise");
        states.put("Illinois", "Springfield");
        states.put("Indiana", "Indianapolis");
        states.put("Iowa", "Des Moines");
        states.put("Kansas", "Topeka");
        states.put("Kentucky", "Frankfurt");
        states.put("Louisiana", "Baton Rouge");
        states.put("Maine", "Augusta");
        states.put("Maryland", "Annapolis");
        states.put("Massachusetts", "Boston");
        states.put("Michigan", "Lansing");
        states.put("Minnesota", "Saint Paul");
        states.put("Mississippi", "Jackson");
        states.put("Missouri", "Jefferson City");
        states.put("Montana", "Helena");
        states.put("Nebraska", "Lincoln");
        states.put("Nevada", "Carson City");
        states.put("New Hampshire", "Concord");
        states.put("New Jersey", "Trenton");
        states.put("New Mexico", "Santa Fe");
        states.put("New York", "Albany");
        states.put("North Carolina", "Raleigh");
        states.put("North Dakota", "Bismarck");
        states.put("Ohio", "Columbus");
        states.put("Oklahoma", "Oklahoma City");
        states.put("Oregon", "Salem");
        states.put("Pennsylvania", "Harrisburg");
        states.put("Rhode Island", "Providence");
        states.put("South Carolina", "Columbia");
        states.put("South Dakota", "Pierre");
        states.put("Tennessee", "Nashville");
        states.put("Texas", "Austin");
        states.put("Utah", "Salt Lake City");
        states.put("Vermont", "Montpelier");
        states.put("Virginia", "Richmond");
        states.put("Washington", "Olympia");
        states.put("West Virginia", "Charleston");
        states.put("Wisconsin", "Madison");
        states.put("Wyoming", "Cheyenne");
        
        int counter = 0;
        PrintWriter out = new PrintWriter(new FileWriter("StateCapitals.txt"));
        Set<String> keys = states.keySet();
        for (String key: keys) {
            out.println(key);
            counter++;       
        }
        out.flush();
        out.close();
        
        String randomLine = new String();
        System.out.println( counter + " STATES & CAPITALS LOADED");
        System.out.println("=======");
        System.out.println("HERE ARE THE STATES : ");
        Scanner sc = new Scanner(new BufferedReader (new FileReader("StateCapitals.txt")));
        while(sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.print(currentLine + ", ");
        }
        
        FileReader file = new FileReader("StateCapitals.txt");
        BufferedReader buffer = new BufferedReader(file);
        Random rand = new Random();
        int randLine = rand.nextInt(counter - 1) + 1;
        for (int i = 1; i <= counter; i++) {
            if (i == randLine) {
                randomLine = buffer.readLine();
            } else {
                buffer.readLine();
            }
        }
        
        
        System.out.println("\n");
        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF " + randomLine + "?" );
        Scanner scanner = new Scanner(System.in);
        String capital = scanner.nextLine();
        if(capital.equals(states.get(randomLine))) {
            System.out.println("That's correct!");
        }   else {
            System.out.println("The correct answer is " + states.get(randomLine));
        }
//        while(sc.hasNextLine()) {
//            String currentLine = sc.nextLine();
//            System.out.println(currentLine + ", ");
//        }
//            System.out.println(key + " - " + states.get(key));
        
        

    }
    
}
