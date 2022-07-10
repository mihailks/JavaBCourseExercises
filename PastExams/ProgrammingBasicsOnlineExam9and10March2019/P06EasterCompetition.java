package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bestName = "";
        int maxPoints = 0;
        int currentNamePoints = 0;
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfCakes; i++) {
            String currentName = scanner.nextLine();
            String input = scanner.nextLine();
            while (!input.equals("Stop")) {
                int currentMark = Integer.parseInt(input);
                currentNamePoints += currentMark;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n",currentName, currentNamePoints);
            if (maxPoints<currentNamePoints){
                maxPoints=currentNamePoints;
                bestName=currentName;
                System.out.printf("%s is the new number 1!%n",bestName);
            }
            currentNamePoints = 0;
        }
        System.out.printf("%s won competition with %d points!%n",bestName, maxPoints);
    }
}
