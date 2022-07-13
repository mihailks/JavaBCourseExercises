package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P14PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());


        for (int s1 = 1; s1 < n; s1++) {
            for (int s2 = 1; s2 < n; s2++) {
                for (int s3 = 'a'; s3 < l + 'a'; s3++) {
                    for (int s4 = 'a'; s4 < l + 'a'; s4++) {
                        int temp;
                        if (s1 > s2) {
                            temp = s1 + 1;
                        } else {
                            temp = s2 + 1;
                        }
                        for (int i = temp; i <= n; i++) {
                            System.out.printf("%d%d%c%c%d ", s1, s2, s3, s4, i);
                        }
                    }
                }
            }
        }
    }
}
