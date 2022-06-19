package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double volumep1 = p1 * h;
        double volumep2 = p2 * h;

        double totalWaterFill = volumep1 + volumep2;
        double percentTotal = totalWaterFill / v * 100;
        double percentp1 = volumep1 / totalWaterFill * 100;
        double percentp2 = volumep2 / totalWaterFill * 100;

        if (v < totalWaterFill) {
            double overFlow = totalWaterFill - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, overFlow);
        } else {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentTotal, percentp1, percentp2);
        }
    }
}
