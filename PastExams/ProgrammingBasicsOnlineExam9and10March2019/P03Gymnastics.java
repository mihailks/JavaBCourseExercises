package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String type = scanner.nextLine();
        double hard = 0;
        double performance = 0;
        switch (country) {
            case "Russia":
                switch (type) {
                    case "ribbon":
                        hard = 9.1;
                        performance = 9.4;
                        break;
                    case "hoop":
                        hard = 9.3;
                        performance = 9.8;
                        break;
                    case "rope":
                        hard = 9.6;
                        performance = 9.0;
                        break;
                }

                break;
            case "Bulgaria":
                switch (type) {
                    case "ribbon":
                        hard = 9.6;
                        performance = 9.4;
                        break;
                    case "hoop":
                        hard = 9.55;
                        performance = 9.75;
                        break;
                    case "rope":
                        hard = 9.5;
                        performance = 9.4;
                        break;
                }
                break;
            case "Italy":
                switch (type) {
                    case "ribbon":
                        hard = 9.2;
                        performance = 9.5;
                        break;
                    case "hoop":
                        hard = 9.45;
                        performance = 9.35;
                        break;
                    case "rope":
                        hard = 9.7;
                        performance = 9.15;
                        break;
                }
                break;
        }
        double totalScore = hard + performance;
        System.out.printf("The team of %s get %.3f on %s.\n", country, totalScore, type);
        System.out.printf("%.2f%%\n", (20 - totalScore) / 20 * 100);

    }
}
