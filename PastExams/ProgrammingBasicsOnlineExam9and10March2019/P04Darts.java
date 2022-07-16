package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playersName = scanner.nextLine();
        int shotCounter = 0;
        int badShotCounter = 0;
        String hit = scanner.nextLine();
        int currentShotPoints=0;
        int gamePoints = 301;
        while (!hit.equals("Retire")) {
            int pointsPerHit = Integer.parseInt(scanner.nextLine());
                shotCounter++;
                switch (hit) {
                    case "Single":
                        currentShotPoints = pointsPerHit;
                        break;
                    case "Double":
                        currentShotPoints = pointsPerHit * 2;
                        break;
                    case "Triple":
                        currentShotPoints = pointsPerHit * 3;
                        break;
            }
            if (currentShotPoints==gamePoints){
                break;
            } else if (currentShotPoints<gamePoints){
                gamePoints-=currentShotPoints;
            } else {
                badShotCounter++;
            }
            hit = scanner.nextLine();
        }
        if (hit.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", playersName, badShotCounter);
        } else {
            System.out.printf("%s won the leg with %d shots.", playersName, shotCounter-badShotCounter);
        }

    }
}
