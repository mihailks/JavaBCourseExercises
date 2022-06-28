package ProgrammingBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = 0;
        int standard = 0;
        int kids = 0;
        int totalTickets = 0;
        int totalTicketsPerMovie = 0;
        String movieName = scanner.nextLine();

        while (!movieName.equals("Finish")) {
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                String type = scanner.nextLine();
                switch (type) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
                if (type.equals("End")){
                    break;
                }
                totalTicketsPerMovie++;
            }
            totalTickets+=totalTicketsPerMovie;
            System.out.printf("%s - %.2f%% full.%n",movieName, totalTicketsPerMovie*1.0/n*100);
            totalTicketsPerMovie=0;
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student*1.0/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n", standard*1.0/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.%n", kids*1.0/totalTickets*100);
    }
}
