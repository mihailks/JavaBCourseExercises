package WhileLoopMoreExercises;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        double sum=0;
        int counter=0;
        for (int i = 1; i <= numbers; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            sum+=n;
        }
        System.out.printf("%.2f", sum/numbers);
    }
}
