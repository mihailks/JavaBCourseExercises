package DrawingFiguresWithLoopsMoreExercises;

import java.util.Scanner;

public class P09House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = (n+1)/2;
        int p = n/2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i-1; j++) {
                System.out.print("-");
            }
            if (n%2==0){
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
            }else {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
            }
            for (int j = 0; j < m - i-1; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        for (int i = 0; i < p; i++) {
            System.out.print("|");
            for (int j = 0; j < n-2; j++) {
                System.out.print("*");
            }
            System.out.println("|");
        }
    }
}
