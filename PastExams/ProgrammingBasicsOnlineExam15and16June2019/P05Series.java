package ProgrammingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double moneyNeed = 0;
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double pricePerSeries = Double.parseDouble(scanner.nextLine());
            switch (name) {
                case "Thrones":
                    pricePerSeries *= 0.5;
                    break;
                case "Lucifer":
                    pricePerSeries *= 0.6;
                    break;
                case "Protector":
                    pricePerSeries *= 0.7;
                    break;
                case "TotalDrama":
                    pricePerSeries *= 0.8;
                    break;
                case "Area":
                    pricePerSeries *= 0.9;
                    break;
            }
            moneyNeed += pricePerSeries;
        }
        if (moneyNeed <= budget) {
            System.out.printf("You bought all the series and left with %.2f lv.", Math.abs(moneyNeed - budget));
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(moneyNeed - budget));
        }
    }
}
