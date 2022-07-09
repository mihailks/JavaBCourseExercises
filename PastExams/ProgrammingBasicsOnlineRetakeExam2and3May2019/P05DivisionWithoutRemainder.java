package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class P05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counterP1 = 0;
        int counterP2 = 0;
        int counterP3 = 0;
        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input % 2 == 0) {
                counterP1++;
            } if (input % 3 == 0) {
                counterP2++;
            } if (input % 4 == 0) {
                counterP3++;
            }
        }
        System.out.printf("%.2f%%%n", counterP1*1.0 / n * 100);
        System.out.printf("%.2f%%%n", counterP2*1.0 / n * 100);
        System.out.printf("%.2f%%%n", counterP3*1.0 / n * 100);
    }
}
