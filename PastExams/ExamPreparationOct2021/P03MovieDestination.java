package ExamPreparationOct2021;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = 0.0;

        switch (season){
            case "Winter":
                switch (destination){
                    case "Dubai":
                        pricePerDay = 45000;
                        break;
                    case "Sofia":
                        pricePerDay = 17000;
                        break;
                    case "London":
                        pricePerDay = 24000;
                        break;
                }
                break;
            case "Summer":
                switch (destination){
                    case "Dubai":
                        pricePerDay = 40000;
                        break;
                    case "Sofia":
                        pricePerDay = 12500;
                        break;
                    case "London":
                        pricePerDay = 20250;
                        break;
                }
                break;
        }
        if (destination.equals("Dubai")){
            pricePerDay*=0.70;
        }else if (destination.equals("Sofia")){
            pricePerDay*=1.25;
        }
        double totalPrice = pricePerDay*days;
        if (budget>=totalPrice){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", Math.abs(budget-totalPrice));
        } else {
            System.out.printf("The director needs %.2f leva more!", Math.abs(budget-totalPrice));
        }

    }
}
