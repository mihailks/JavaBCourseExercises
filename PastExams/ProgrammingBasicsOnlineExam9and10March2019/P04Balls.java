package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBalls = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int otherBalls = 0;
        int blackBalls = 0;
        for (int i = 1; i <= numberOfBalls; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    totalPoints += 5;
                    redBalls++;
                    break;
                case "orange":
                    totalPoints += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowBalls++;
                    break;
                case "white":
                    totalPoints += 20;
                    whiteBalls++;
                    break;
                case "black":
                    totalPoints /= 2;
                    blackBalls++;
                    break;
                default:
                    otherBalls++;
            }
        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d%n", blackBalls);
    }
}
