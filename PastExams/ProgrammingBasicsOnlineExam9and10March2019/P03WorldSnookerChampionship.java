package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String part = scanner.nextLine();
        String tickedType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine();
        double price = 0;
        boolean getReduction = false;
        switch (part) {
            case "Quarter final":

                switch (tickedType) {
                    case "Standard":
                        price = 55.50;
                        break;
                    case "Premium":
                        price = 105.20;
                        break;
                    case "VIP":
                        price = 118.90;
                        break;
                }
                break;
            case "Semi final":
                switch (tickedType) {
                    case "Standard":
                        price = 75.88;
                        break;
                    case "Premium":
                        price = 125.22;
                        break;
                    case "VIP":
                        price = 300.40;
                        break;
                }
                break;
            case "Final":
                switch (tickedType) {
                    case "Standard":
                        price = 110.10;
                        break;
                    case "Premium":
                        price = 160.66;
                        break;
                    case "VIP":
                        price = 400;
                        break;
                }
                break;
        }
        double totalPrice = price * tickets;

        if (totalPrice > 2500 && totalPrice <= 4000) {
            totalPrice *= 0.9;
        } else if (totalPrice > 4000) {
            getReduction = true;
            totalPrice *= 0.75;
        }
        if (photo.equals("Y")) {
            if (!getReduction) {
                totalPrice += tickets * 40;
            }
        }
        System.out.printf("%.2f", totalPrice);
    }
}
