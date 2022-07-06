package ProgrammingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class P01MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentForTheater = Integer.parseInt(scanner.nextLine());

        double totalPrice = days * tickets * ticketPrice;
        double profit = totalPrice * percentForTheater / 100;
        System.out.printf("The profit from the movie %s is %.2f lv.", name, totalPrice - profit);
    }
}
