package ForLoopMoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalScore = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        for (int i = 1; i <= n; i++) {
            int score = Integer.parseInt(scanner.nextLine());

            if (score >= 0 && score <= 9) {
                totalScore += score * 0.20;
                counter1++;
            } else if (score >= 10 && score <= 19) {
                totalScore += score * 0.30;
                counter2++;
            } else if (score >= 20 && score <= 29) {
                totalScore += score * 0.40;
                counter3++;
            } else if (score >= 30 && score <= 39) {
                totalScore += 50;
                counter4++;
            } else if (score >= 40 && score <= 50) {
                totalScore += 100;
                counter5++;
            } else {
                totalScore /= 2;
                counter6++;
            }
        }
        System.out.printf("%.2f%n", totalScore);
        System.out.printf("From 0 to 9: %.2f%%%n", counter1 * 1.0 / n * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", counter2 * 1.0 / n * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", counter3 * 1.0 / n * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", counter4 * 1.0 / n * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", counter5 * 1.0 / n * 100);
        System.out.printf("Invalid numbers: %.2f%%", counter6 * 1.0 / n * 100);
    }
}
