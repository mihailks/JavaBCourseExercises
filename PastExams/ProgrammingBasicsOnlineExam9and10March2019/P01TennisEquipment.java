package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rocket = Double.parseDouble(scanner.nextLine());
        int numRocket = Integer.parseInt(scanner.nextLine());
        int sneackers = Integer.parseInt(scanner.nextLine());
        double totalPrice = numRocket * rocket + rocket / 6 * sneackers;
        totalPrice *= 1.2;

        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(totalPrice / 8));
        System.out.printf("Price to be paid by sponsors %.0f\n", Math.ceil(totalPrice * 7 / 8));
    }
}
