package NestedLoopsExercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = first; i <= second; i++) {
            int currentNumber = i;
            for (int j = 6; j >= 1; j--) {
                int currentDigit = currentNumber % 10;
                if (j % 2 == 0) {
                    sumEven += currentDigit;
                } else {
                    sumOdd += currentDigit;
                }
                currentNumber /= 10;
            }
            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }
            sumEven = 0;
            sumOdd = 0;
        }
    }
}
