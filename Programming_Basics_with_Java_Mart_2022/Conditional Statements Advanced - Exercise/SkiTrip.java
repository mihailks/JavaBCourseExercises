package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String room = scanner.nextLine();
        String review = scanner.nextLine();
        double price = 0.0;
        double singleRoom = 18.0;
        double apartment = 25;
        double presidentA = 35;

        switch (room) {
            case "room for one person":
                price = (nights * singleRoom);
                break;


            case "apartment":
                if (days < 10) {
                    price = (nights * apartment) * 0.7;
                } else if (days <= 15) {
                    price = (nights * apartment) * 0.65;
                } else {
                    price = (nights * apartment) * 0.5;
                }
                break;


            case "president apartment":
                if (days < 10) {
                    price = (nights * presidentA) * 0.9;
                } else if (days <= 15) {
                    price = (nights * presidentA) * 0.85;
                } else {
                    price = (nights * presidentA) * 0.8;
                }
                break;

        }

        if (review.equals("positive")) {
            price *= 1.25;
        } else {
            price *= 0.9;
        }
        System.out.printf("%.2f",price);

    }
}
