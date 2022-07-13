package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P07SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int passwordCounter = 0;
        boolean isFinished = false;
        for (int A = 35; A <= 55; A++) {
            for (int B = 64; B <= 96; B++) {
                for (int x = 1; x <= a; x++) {
                    for (int y = 1; y <= b; y++) {
                        System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                        passwordCounter++;
                        if (A == 55) {
                            A = 35;
                        } else {
                            A++;
                        }
                        if (B == 96) {
                            B = 64;
                        } else {
                            B++;
                        }
                        if (passwordCounter == maxPasswords || x == a && y == b) {
                            isFinished = true;
                            break;
                        }
                    }
                    if (isFinished) break;
                }
                if (isFinished) break;
            }
            if (isFinished) break;
        }
    }
}





