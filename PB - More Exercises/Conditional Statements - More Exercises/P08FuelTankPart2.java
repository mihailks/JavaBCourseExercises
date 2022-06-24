package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();
        double totalPrice = 0.0;

        switch (fuelType){
            case "Diesel":
                if (card.equals("Yes")){
                    totalPrice = liters*(2.33-0.12);
                } else {
                    totalPrice = liters*2.33;
                }
                break;
            case "Gasoline":
                if (card.equals("Yes")){
                    totalPrice = liters*(2.22-0.18);
                } else {
                    totalPrice = liters*2.22;
                }
                break;
            case "Gas":
                if (card.equals("Yes")){
                    totalPrice = liters*(0.93-0.08);
                } else {
                    totalPrice = liters*0.93;
                }
                break;
        }
        if (liters>=20 && liters<=25){
            totalPrice *= 0.92;
        }else if (liters>25){
            totalPrice*= 0.90;
        }

        System.out.printf("%.2f lv.", totalPrice);

    }
}
