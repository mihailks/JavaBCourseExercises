package ProgrammingBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent  = Integer.parseInt(scanner.nextLine());

        double price = rent*0.7;
        double food = price*0.85;
        double music = food/2;

        double cost = rent + food + music + price;
        System.out.printf("%.2f",cost);
    }
}
