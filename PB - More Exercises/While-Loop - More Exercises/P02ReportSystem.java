package WhileLoopMoreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = Integer.parseInt(scanner.nextLine());
        int currentsSum = 0;
        int transactionCounter = 0;
        int cashTransactions = 0;
        int cardTransactions = 0;
        double totalCash = 0;
        double totalCard = 0;
        String input = "";
        while (currentsSum < totalSum) {
            input = scanner.nextLine();
            if (input.equals("End")) {
                System.out.println("Failed to collect required money for charity.");
                break;
            }
            int price = Integer.parseInt(input);
            transactionCounter++;
            if (transactionCounter % 2 != 0) {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    currentsSum += price;
                    totalCash += price;
                    cashTransactions++;
                }
            } else {
                if (price <= 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    currentsSum += price;
                    totalCard += price;
                    cardTransactions++;
                }
            }
        }
        if (!input.equals("End")) {
            System.out.printf("Average CS: %.2f%n", totalCash / cashTransactions);
            System.out.printf("Average CC: %.2f", totalCard / cardTransactions);
        }
    }
}
