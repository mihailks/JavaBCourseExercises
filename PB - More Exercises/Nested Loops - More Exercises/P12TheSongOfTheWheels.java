package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int control = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d) {
                            if ((a * b + c * d) == control) {
                                counter++;
                                if (counter == 4) {
                                    p1 = a;
                                    p2 = b;
                                    p3 = c;
                                    p4 = d;
                                }
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (counter>=4){
            System.out.printf("Password: %d%d%d%d", p1, p2, p3, p4);
        } else {
            System.out.println("No!");
        }
    }
}
