package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mount = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNightStudio = 0.0;
        double pricePerNightApart = 0.0;

        if (mount.equals("May") || mount.equals("October")) {
            pricePerNightStudio = 50;
            pricePerNightApart = 65;
            if (nights>7 && nights<=14){
                pricePerNightStudio*=0.95;
            }else if (nights>14){
                pricePerNightStudio*=0.70;
            }
        } else if (mount.equals("June") || mount.equals("September")) {
            pricePerNightStudio = 75.20;
            pricePerNightApart = 68.70;
            if (nights>14){
                pricePerNightStudio*=0.8;
            }
        } else if (mount.equals("July") || mount.equals("August")) {
            pricePerNightStudio = 76;
            pricePerNightApart = 77;
        }

        if (nights>14){
            pricePerNightApart *=0.90;
        }

        double totalStudio = pricePerNightStudio * nights;
        double totalApart = pricePerNightApart * nights;
        System.out.printf("Apartment: %.2f lv.%n",totalApart);
        System.out.printf("Studio: %.2f lv.",totalStudio);



    }
}
