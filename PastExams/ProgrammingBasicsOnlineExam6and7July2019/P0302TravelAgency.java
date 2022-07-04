package ProgrammingBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class P0302TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String type = scanner.nextLine();
        String VIP = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        switch (town) {
            case "Bansko":
            case "Borovets":
                switch (type) {
                    case "withEquipment":
                        totalPrice = 100;
                        break;
                    case "noEquipment":
                        totalPrice = 80;
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
                break;
            case "Varna":
            case "Burgas":
                switch (type) {
                    case "withBreakfast":
                        totalPrice = 130;
                        break;
                    case "noBreakfast":
                        totalPrice = 100;
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
                break;
            default:
                System.out.println("Invalid input!");
        }
        if (VIP.equals("yes")) {
            switch (type) {
                case "withEquipment":
                    totalPrice *= 0.9;
                    break;
                case "noEquipment":
                    totalPrice *= 0.95;
                    break;
                case "withBreakfast":
                    totalPrice *= 0.88;
                    break;
                case "noBreakfast":
                    totalPrice *= 0.93;
                    break;
            }
        }
        if (days > 7) {
            days --;
        }
        totalPrice *= days;

        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else if (totalPrice != 0) {
            System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
        }
    }
}
