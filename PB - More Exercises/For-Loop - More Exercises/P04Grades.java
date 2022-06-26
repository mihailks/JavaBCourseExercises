package ForLoopMoreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        double total = 0;
        for (int i = 1; i <= students; i++) {
            double mark = Double.parseDouble(scanner.nextLine());
            total += mark;
            if (mark >= 2 && mark <= 2.99) {
                counter1++;
            } else if (mark >= 3 && mark <= 3.99) {
                counter2++;
            } else if (mark >= 4 && mark <= 4.99) {
                counter3++;
            } else {
                counter4++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", counter4 * 1.0 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", counter3 * 1.0 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", counter2 * 1.0 / students * 100);
        System.out.printf("Fail: %.2f%%%n", counter1 * 1.0 / students * 100);
        System.out.printf("Average: %.2f", total / students);
    }
}
