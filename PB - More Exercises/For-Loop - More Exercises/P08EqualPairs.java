package ForLoopMoreExercises;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int first = 0;
        int second = 0;
        int temp = 0;
        int maxDiff = Integer.MIN_VALUE;
        boolean isSame = true;


        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            first = a + b;
            if (second-first>maxDiff){
                maxDiff = first - second;
            }
            second=first;

        }
        if (maxDiff==0){
            System.out.printf("Yes, value=%d",first);
        } else {
            System.out.printf("No, maxdiff=%d",maxDiff);
        }

    }
}
