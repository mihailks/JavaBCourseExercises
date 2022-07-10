package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int recordMin = Integer.parseInt(scanner.nextLine());
        int recordSec = Integer.parseInt(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        int secFor100 = Integer.parseInt(scanner.nextLine());

        recordSec += recordMin * 60;
        double timeInSec = meters / 100 * secFor100 - (meters / 120 * 2.5);


        if (timeInSec <= recordSec) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeInSec);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", timeInSec - recordSec);
        }

    }
}
