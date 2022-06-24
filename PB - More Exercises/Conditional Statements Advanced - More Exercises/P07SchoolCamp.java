package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeOfGroup = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String sportType = "";
        double budget = 0.0;

        switch (season) {
            case "Winter":
                if (typeOfGroup.equals("boys")) {
                    budget = nights * students * 9.60;
                    sportType = "Judo";
                } else if (typeOfGroup.equals("girls")) {
                    budget = nights * students * 9.60;
                    sportType = "Gymnastics";
                } else {
                    budget = nights * students * 10.00;
                    sportType = "Ski";
                }
                break;
            case "Spring":
                if (typeOfGroup.equals("boys")) {
                    budget = nights * students * 7.20;
                    sportType = "Tennis";
                } else if (typeOfGroup.equals("girls")) {
                    budget = nights * students * 7.20;
                    sportType = "Athletics";
                } else {
                    budget = nights * students * 9.50;
                    sportType = "Cycling";
                }
                break;
            case "Summer":
                if (typeOfGroup.equals("boys")) {
                    budget = nights * students * 15.00;
                    sportType = "Football";
                } else if (typeOfGroup.equals("girls")) {
                    budget = nights * students * 15.0;
                    sportType = "Volleyball";
                } else {
                    budget = nights * students * 20.00;
                    sportType = "Swimming";
                }
                break;
        }

        if (students >= 10 && students < 20) {
            budget *= 0.95;
        } else if (students >= 20 && students < 50) {
            budget *= 0.85;
        } else if (students >= 50) {
            budget *= 0.5;
        }

        System.out.printf("%s %.2f lv.", sportType, budget);
    }
}
