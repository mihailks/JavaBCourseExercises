package ProgrammingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        double salaryForLessThen15=0;

        while (!name.equals("ACTION")){
            if (name.length()<=15){
                salaryForLessThen15 = Double.parseDouble(scanner.nextLine());
                budget-=salaryForLessThen15;
            }else {
                budget*=0.8;
            }
            if (budget<=0){
                break;
            }
            name = scanner.nextLine();
        }
        if (budget<=0){
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
