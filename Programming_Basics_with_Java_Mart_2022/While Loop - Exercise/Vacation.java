package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scanner.nextLine());
        double ownMoney = Double.parseDouble(scanner.nextLine());
        double moneyFlow = 0;
        int spendCounter = 0;
        int days = 0;
        String input = "";

        while (spendCounter < 5) {
            input = scanner.nextLine();
            moneyFlow = Double.parseDouble(scanner.nextLine());
            days++;
            if (input.equals("save")) {
                ownMoney += moneyFlow;
                spendCounter = 0;
                if (ownMoney>=tripMoney){
                    System.out.printf("You saved the money for %d days.",days);
                    break;
                }
            } else if (input.equals("spend")) {
                ownMoney -= moneyFlow;
                spendCounter++;
                if (ownMoney <= 0) {
                    ownMoney = 0;
                }
            }
        }
        if (spendCounter >= 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
    }
}
