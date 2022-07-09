package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double liters = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double costs = liters * 2.1 + 100;
        if (day.equals("Saturday")) {
            costs *= 0.9;
        } else {
            costs *= 0.8;
        }
        if (budget >= costs) {
            System.out.printf("Safari time! Money left: %.2f lv.", Math.abs(budget - costs));
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(budget - costs));
        }
    }
}
