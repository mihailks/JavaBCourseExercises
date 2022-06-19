package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String years = scanner.nextLine();
        String planType = scanner.nextLine();
        String internetPlan = scanner.nextLine();
        int mounts = Integer.parseInt(scanner.nextLine());
        double monthlyPayment = 0.0;

        switch (years) {
            case "one":
                if (planType.equals("Small")) {
                    monthlyPayment = 9.98;
                } else if (planType.equals("Middle")) {
                    monthlyPayment = 18.99;
                } else if (planType.equals("Large")) {
                    monthlyPayment = 25.98;
                } else if (planType.equals("ExtraLarge")) {
                    monthlyPayment = 35.99;
                }
                break;
            case "two":
                if (planType.equals("Small")) {
                    monthlyPayment = 8.58;
                } else if (planType.equals("Middle")) {
                    monthlyPayment = 17.09;
                } else if (planType.equals("Large")) {
                    monthlyPayment = 23.59;
                } else if (planType.equals("ExtraLarge")) {
                    monthlyPayment = 31.79;
                }
                break;
        }
        if (internetPlan.equals("yes")) {
            if (monthlyPayment <= 10) {
                monthlyPayment += 5.50;
            } else if (monthlyPayment <= 30) {
                monthlyPayment += 4.35;
            } else {
                monthlyPayment += 3.85;
            }
        }
        if (years.equals("two")) {
            monthlyPayment *=0.9625;
        }

        System.out.printf("%.2f lv.",monthlyPayment*mounts);
    }
}
