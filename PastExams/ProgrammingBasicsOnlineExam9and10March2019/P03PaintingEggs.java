package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (size) {
            case "Large":
                switch (color) {
                    case "Red":
                        price = 16;
                        break;
                    case "Green":
                        price = 12;
                        break;
                    case "Yellow":
                        price = 9;
                        break;
                }
                break;
            case "Medium":
                switch (color) {
                    case "Red":
                        price = 13;
                        break;
                    case "Green":
                        price = 9;
                        break;
                    case "Yellow":
                        price = 7;
                        break;
                }
                break;
            case "Small":
                switch (color) {
                    case "Red":
                        price = 9;
                        break;
                    case "Green":
                        price = 8;
                        break;
                    case "Yellow":
                        price = 5;
                        break;
                }
                break;
        }
        System.out.printf("%.2f leva.", price * count * 0.65);
    }
}
