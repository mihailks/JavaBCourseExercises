package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class SuitcasesLoad_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkVolume = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int bagCounter = 0;

        while (!input.equals("End")) {
            double bagVolume = Double.parseDouble(input);
            bagCounter++;

            if (bagCounter % 3==0) {
                bagVolume *= 1.10;
            }
            trunkVolume -= bagVolume;
            if (trunkVolume<=0) {
                System.out.println("No more space!");
                if (trunkVolume!=0) {
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
