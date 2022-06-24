package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String typeOfTicked = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double moneyNeeded;
        if (numberOfPeople <= 4) {
            budget *= 0.25;
        } else if (numberOfPeople <= 9) {
            budget *= 0.40;
        } else if (numberOfPeople <= 24) {
            budget *= 0.50;
        } else if (numberOfPeople <= 49) {
            budget *= 0.60;
        } else {
            budget *= 0.75;
        }

        if (typeOfTicked.equals("VIP")) {
            moneyNeeded = numberOfPeople * 499.99;
        } else {
            moneyNeeded = numberOfPeople * 249.99;
        }
        if (budget >= moneyNeeded) {
            System.out.printf("Yes! You have %.2f leva left.", budget - moneyNeeded);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded - budget);
        }


    }
}
