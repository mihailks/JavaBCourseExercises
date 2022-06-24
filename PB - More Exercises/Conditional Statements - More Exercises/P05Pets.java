package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int totalFood = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        turtleFood /= 1000;

        double neededFood = days*(dogFood+catFood+turtleFood);

        if (totalFood>=neededFood)
        {
            System.out.printf("%.0f kilos of food left.", Math.floor(totalFood-neededFood));
        }else
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(neededFood-totalFood));
    }

}
