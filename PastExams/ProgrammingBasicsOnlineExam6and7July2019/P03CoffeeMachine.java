package ProgrammingBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String sugar = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (type) {
            case "Espresso":
                switch (sugar) {
                    case "Without":
                        price = 0.9 * 0.65;
                        break;
                    case "Normal":
                        price = 1;
                        break;
                    case "Extra":
                        price = 1.2;
                        break;
                }
                break;
            case "Cappuccino":
                switch (sugar) {
                    case "Without":
                        price = 1 * 0.65;
                        break;
                    case "Normal":
                        price = 1.2;
                        break;
                    case "Extra":
                        price = 1.6;
                        break;
                }
                break;
            case "Tea":
                switch (sugar) {
                    case "Without":
                        price = 0.5 * 0.65;
                        break;
                    case "Normal":
                        price = 0.6;
                        break;
                    case "Extra":
                        price = 0.7;
                        break;
                }
                break;
        }
        if (type.equals("Espresso") && n >= 5) {
            price *= 0.75;
        }
        price *= n;
        if (price > 15) {
            price *= 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", n, type, price);
    }
}
