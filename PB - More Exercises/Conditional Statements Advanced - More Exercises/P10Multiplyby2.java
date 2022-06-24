package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P10Multiplyby2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        while (n>=0){
            System.out.printf("Result: %.2f%n",n*2);
            n = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Negative number!");
    }
}
