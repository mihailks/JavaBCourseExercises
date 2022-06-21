package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class SuitcasesLoad_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkVolume = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int bagCounter = 0;
        double totalBagVolume = 0.0;

        while (!input.equals("End")) {
            double bagVolume = Double.parseDouble(input);
            bagCounter++;

            if (bagCounter % 3==0) {
                bagVolume *= 1.10;
            }
            totalBagVolume += bagVolume;
            if (totalBagVolume >= trunkVolume) {
                System.out.println("No more space!");
                if (totalBagVolume != trunkVolume) {
                    bagCounter -= 1;
                }
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", bagCounter);
    }
}
