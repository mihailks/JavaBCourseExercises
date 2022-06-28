package ProgrammingBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class P02GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        if (workers > 150) {
            clothes *= 0.9;
        }
        double cost = decor + workers * clothes;
        if (budget < cost) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - cost));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(budget - cost));
        }

    }
}
