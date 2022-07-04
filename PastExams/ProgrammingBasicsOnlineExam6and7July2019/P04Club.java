package ProgrammingBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        double totalPrice = 0;

        while (!name.equals("Party!")) {
            int n = Integer.parseInt(scanner.nextLine());
            double price = name.length() * n;
            if (price%2!=0){
                price*=0.75;
            }
            totalPrice +=price;
            if (totalPrice>=target){
                break;
            }
            name = scanner.nextLine();
        }

        if (totalPrice<target){
            System.out.printf("We need %.2f leva more.%n",Math.abs(target-totalPrice));
            System.out.printf("Club income - %.2f leva.",totalPrice);
        } else {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.",totalPrice);
        }

    }
}
