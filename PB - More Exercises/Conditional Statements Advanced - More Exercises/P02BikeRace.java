package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        double price = 0.0;

        switch (type) {
            case "trail":
                price = juniors * 5.5 + seniors * 7;
                break;
            case "cross-country":
                price = juniors * 8 + seniors * 9.5;
                if (juniors + seniors >= 50) {
                    price *= 0.75;
                }
                break;
            case "downhill":
                price = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                price = juniors * 20 + seniors * 21.50;
                break;
        }
        price *= 0.95;
        System.out.printf("%.2f", price);

    }
}
