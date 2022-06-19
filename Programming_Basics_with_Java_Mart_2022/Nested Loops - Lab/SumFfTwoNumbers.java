package NestedLoopsLab;

import java.util.Scanner;

public class SumFfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean find = false;

        for (int i = start; i <= finish; i++) {
            for (int j = start; j <= finish; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d ", counter);
                    System.out.printf("(%d + %d = %d)", i, j, magicNumber);
                    find = true;
                }
            }
            if (find) {
                break;
            }
        }
        if (!find) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
