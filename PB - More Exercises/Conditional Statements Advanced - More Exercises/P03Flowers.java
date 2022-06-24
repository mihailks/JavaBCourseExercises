package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int laleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double price = 0.0;

        switch (season) {
            case "Spring":
                price = hrizantemi * 2 + roses * 4.10 + laleta * 2.50;
                if (holiday.equals("Y")) {
                    price *= 1.15;
                }
                if (laleta > 7) {
                    price *= 0.95;
                }
                break;
            case "Summer":
                price = hrizantemi * 2 + roses * 4.10 + laleta * 2.50;
                if (holiday.equals("Y")) {
                    price *= 1.15;
                }
                break;
            case "Autumn":
                price = hrizantemi * 3.75 + roses * 4.50 + laleta * 4.15;
                if (holiday.equals("Y")) {
                    price *= 1.15;
                }
                break;
            case "Winter":
                price = hrizantemi * 3.75 + roses * 4.50 + laleta * 4.15;
                if (holiday.equals("Y")) {
                    price *= 1.15;
                }
                if (roses >= 10) {
                    price *= 0.9;
                }
                break;
        }
        if (hrizantemi + roses + laleta > 20) {
            price *= 0.8;
        }
        price += 2;
        System.out.printf("%.2f", price);
    }
}
