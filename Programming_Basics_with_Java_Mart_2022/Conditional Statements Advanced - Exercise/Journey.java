package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = "";
        String destination = "";
        double spend = 0.0;

        if (budget <= 100) {
            place = "Bulgaria";
            if (season.equals("summer")) {
                spend = budget * 0.3;
                destination = "Camp";
            } else {
                spend = budget * 0.7;
                destination = "Hotel";
            }
        }
        if (budget > 100 && budget<=1000) {
            place = "Balkans";
            if (season.equals("summer")) {
                spend = budget * 0.4;
                destination = "Camp";
            } else {
                spend = budget * 0.8;
                destination = "Hotel";
            }
        }
        if (budget > 1000) {
            place = "Europe";
            destination = "Hotel";
            spend = budget * 0.9;
        }
        System.out.printf("Somewhere in %s%n", place);
        System.out.printf("%s - %.2f", destination, spend);
    }
}
