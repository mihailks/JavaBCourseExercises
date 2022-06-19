package NestedLoopsLab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n; j++) {
                for (k = 0; k <= n; k++) {
                    if (i + j + k == n) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
