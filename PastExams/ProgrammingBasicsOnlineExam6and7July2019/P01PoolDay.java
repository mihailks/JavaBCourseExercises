package ProgrammingBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double tickedPrice = Double.parseDouble(scanner.nextLine());
        double bedPrice = Double.parseDouble(scanner.nextLine());
        double ambrellaPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = Math.ceil(n * 1.0 / 2) * ambrellaPrice;
        totalPrice += Math.ceil(n * 0.75) * bedPrice;
        totalPrice += tickedPrice * n;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
