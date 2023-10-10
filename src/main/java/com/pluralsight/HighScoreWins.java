package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 teams and their scores (Home:Visitor|XX:XX): ");
        String input = scanner.nextLine();

        String[]inputSplit = input.split("\\:");
        String team1 = inputSplit[0];
        int team2score = Integer.parseInt(inputSplit[2]);

        String[] inputSplit2 = inputSplit[1].split("\\|");
        String team2 = inputSplit2[0];
        int team1score = Integer.parseInt(inputSplit2[1]);

        if (team1score > team2score){
            System.out.print("The winner is: " + team1);
        }
        else {
            System.out.print("The winner is: " + team2);
        }
    }
}
