package ProgrammingBasicsExam21February2016;

import java.util.Scanner;

public class P02EncodedAnswers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        for (int i = 1; i <= n; i++) {
            long questionNumber = scanner.nextLong();

            if (questionNumber % 4 == 0) {
                counterA++;
                System.out.print("a ");
            } else if (questionNumber % 4 == 1) {
                counterB++;
                System.out.print("b ");
            } else if (questionNumber % 4 == 2) {
                counterC++;
                System.out.print("c ");
            } else if (questionNumber % 4 == 3) {
                counterD++;
                System.out.print("d ");
            }

        }
        System.out.println();
        System.out.printf("Answer A: %d%n",counterA);
        System.out.printf("Answer B: %d%n",counterB);
        System.out.printf("Answer C: %d%n",counterC);
        System.out.printf("Answer D: %d%n",counterD);

    }
}
