package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double total = 0.00;

        switch (flowers){
            case "Roses":
                if (count<=80){
                    total = count * 5.00;
                }else {
                    total = count * 5.00 * 0.90;
                }
                break;
            case "Dahlias":
                if (count<=90){
                    total = count * 3.80;
                }else {
                    total = count * 3.80 * 0.85;
                }
                break;
            case "Tulips":
                if (count<=80){
                    total = count * 2.80;
                }else {
                    total = count * 2.80 * 0.85;
                }
                break;
            case "Narcissus":
                if(count<120){
                    total = count * 3.00 * 1.15;
                }else {
                    total = count * 3.00;
                }
                break;
            case "Gladiolus":
                if(count<80){
                    total = count * 2.50 * 1.20;
                }else {
                    total = count * 2.50;
                }
                break;
        }

        if (total<=budget){
            double moneyLeft = budget - total;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count, flowers, moneyLeft);

        } else {
            double noMoney = total - budget;
            System.out.printf("Not enough money, you need %.2f leva more.",noMoney);
        }
    }
}
