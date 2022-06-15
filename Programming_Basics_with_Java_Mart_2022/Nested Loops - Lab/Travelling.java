package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        double moneySaved = 0.0;

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            while (budget > moneySaved) {
                double moneyPlus = Double.parseDouble(scanner.nextLine());
                moneySaved += moneyPlus;
            }
            System.out.printf("Going to %s!%n", destination);
            moneySaved=0;
            destination = scanner.nextLine();

        }
    }
}
