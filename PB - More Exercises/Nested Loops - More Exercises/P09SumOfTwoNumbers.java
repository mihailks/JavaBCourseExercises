package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P09SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                counter++;
                if (i + j == c) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, c);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, c);
        }
    }
}
