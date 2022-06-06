package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermans = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (season) {
            case "Spring":
                if (fishermans <= 6) {
                    price = 3000 * 0.9;
                }
                if (fishermans >= 7 && fishermans <= 12) {
                    price = 3000 * 0.85;
                }
                if (fishermans > 12) {
                    price = 3000 * 0.75;
                }
                break;

            case "Winter":
                if (fishermans <= 6) {
                    price = 2600 * 0.9;
                }
                if (fishermans >= 7 && fishermans <= 12) {
                    price = 2600 * 0.85;
                }
                if (fishermans > 12) {
                    price = 2600 * 0.75;
                }
                break;
        }
        if (season.equals("Summer") || season.equals("Autumn")){
            if (fishermans <= 6) {
                price = 4200 * 0.9;
            }
            if (fishermans >= 7 && fishermans <= 12) {
                price = 4200 * 0.85;
            }
            if (fishermans > 12) {
                price = 4200 * 0.75;
            }
        }

        if (fishermans%2==0 && !season.equals("Autumn")){
            price *= 0.95;
        }

        double remainingMoney = 0.0;
        if (budget >= price) {
            remainingMoney = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", remainingMoney);
        } else {
            remainingMoney = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", remainingMoney);
        }
    }
}
//switch (season) {
//        case "Spring":
//        if (fishermans <= 6 && fishermans % 2 == 0) {
//        price = 3000 * 0.9 * 0.95;
//        } else if (fishermans <= 6) {
//        price = 3000 * 0.9;
//        }
//        if (fishermans >= 7 && fishermans <= 12 && fishermans % 2 == 0) {
//        price = 3000 * 0.85 * 0.95;
//        } else if (fishermans >= 7 && fishermans <= 12) {
//        price = 3000 * 0.85;
//        }
//        if (fishermans > 12 && fishermans % 2 == 0) {
//        price = 3000 * 0.75 * 0.95;
//        } else if (fishermans > 12) {
//        price = 3000 * 0.75;
//        }
//        break;
//
//        case "Summer":
//        if (fishermans <= 6 && fishermans % 2 == 0) {
//        price = 4200 * 0.9 * 0.95;
//        } else if (fishermans <= 6) {
//        price = 4200 * 0.9;
//        }
//        if (fishermans >= 7 && fishermans <= 12 && fishermans % 2 == 0) {
//        price = 4200 * 0.85 * 0.95;
//        } else if (fishermans >= 7 && fishermans <= 12) {
//        price = 4200 * 0.85;
//        }
//        if (fishermans > 12 && fishermans % 2 == 0) {
//        price = 4200 * 0.75 * 0.95;
//        } else if (fishermans > 12) {
//        price = 4200 * 0.75;
//        }
//        break;
//
//        case "Autumn":
//        if (fishermans <= 6) {
//        price = 4200 * 0.9;
//        }
//        if (fishermans >= 7 && fishermans <= 12) {
//        price = 4200 * 0.85;
//        }
//        if (fishermans > 12) {
//        price = 4200 * 0.75;
//        }
//        break;
//
//        case "Winter":
//        if (fishermans <= 6 && fishermans % 2 == 0) {
//        price = 2600 * 0.9 * 0.95;
//        } else if (fishermans <= 6) {
//        price = 3000 * 0.9;
//        }
//        if (fishermans >= 7 && fishermans <= 12 && fishermans % 2 == 0) {
//        price = 2600 * 0.85 * 0.95;
//        } else if (fishermans >= 7 && fishermans <= 12) {
//        price = 3000 * 0.85;
//        }
//        if (fishermans > 12 && fishermans % 2 == 0) {
//        price = 2600 * 0.75 * 0.95;
//        } else if (fishermans > 12) {
//        price = 2600 * 0.75;
//        }
//        break;
//        }
