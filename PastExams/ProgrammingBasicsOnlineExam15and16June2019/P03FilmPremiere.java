package ProgrammingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class P03FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String consumption = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (name) {
            case "John Wick":
                switch (consumption) {
                    case "Drink":
                        price = 12;
                        break;
                    case "Popcorn":
                        price = 15;
                        break;
                    case "Menu":
                        price = 19;
                        break;
                }
                break;
            case "Star Wars":
                switch (consumption) {
                    case "Drink":
                        price = 18;
                        break;
                    case "Popcorn":
                        price = 25;
                        break;
                    case "Menu":
                        price = 30;
                        break;
                }
                break;
            case "Jumanji":
                switch (consumption) {
                    case "Drink":
                        price = 9;
                        break;
                    case "Popcorn":
                        price = 11;
                        break;
                    case "Menu":
                        price = 14;
                        break;
                }
                break;
        }
        if (tickets == 2 && name.equals("Jumanji")) {
            price *= 0.85;
        }
        if (tickets >= 4 && name.equals("Star Wars")) {
            price *= 0.7;
        }
        System.out.printf("Your bill is %.2f leva.", price * tickets);
    }
}
