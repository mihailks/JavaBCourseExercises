package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class P01PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processor = Double.parseDouble(scanner.nextLine());
        double graphicsCard = Double.parseDouble(scanner.nextLine());
        double ramMemory = Double.parseDouble(scanner.nextLine());
        int numberOfRamMemory = Integer.parseInt(scanner.nextLine());
        double promo = Double.parseDouble(scanner.nextLine());

        double totalInUSD = (processor+graphicsCard)-(processor+graphicsCard)*promo + ramMemory*numberOfRamMemory;
        double totalInBGN = totalInUSD*1.57;

        System.out.printf("Money needed = %.2f",totalInBGN);


    }
}
