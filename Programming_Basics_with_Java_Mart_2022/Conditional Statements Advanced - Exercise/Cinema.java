package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rolls = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        switch (type){
            case "Premiere":
                double prPrice = rolls * column * 12;
                System.out.printf("%.2f leva", prPrice);
                break;
            case "Normal":
                double prNormal = rolls * column * 7.5;
                System.out.printf("%.2f leva", prNormal);
                break;
            case "Discount":
                double prDis = rolls * column * 5;
                System.out.printf("%.2f leva", prDis);
                break;
        }
    }

}
