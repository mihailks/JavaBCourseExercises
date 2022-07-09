package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import jdk.jshell.ImportSnippet;

import java.util.Scanner;

public class P04DartsTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        int moves = 0;
        String sector = "";

        while (points > 0) {
            sector = scanner.nextLine();
            if (sector.equals("bullseye")) {
                moves++;
                break;
            }
            int pointsPerHit = Integer.parseInt(scanner.nextLine());
            switch (sector) {
                case "double ring":
                    pointsPerHit *= 2;
                    break;
                case "triple ring":
                    pointsPerHit *= 3;
                    break;
            }
            points -= pointsPerHit;
            moves++;
        }
        if (sector.equals("bullseye")) {
            System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", moves);
        } else if (points == 0) {
            System.out.printf("Congratulations! You won the game in %d moves!", moves);
        } else {
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(points));
        }
    }
}
