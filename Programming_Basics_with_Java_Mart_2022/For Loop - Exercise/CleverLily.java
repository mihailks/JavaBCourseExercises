package ForLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washer = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());
        int toys = 0;
        int brother = 0;
        double money = 0;

        for (int i = 1 ; i <= age; i++){
            if (i%2!=0){
                toys++;
            }else {
                money += i/2*10-1;

            }
        }
        double lilisMoney = money + toys*toyPrice;

        if (lilisMoney>=washer){
            System.out.printf("Yes! %.2f%n", lilisMoney-washer);
        }else {
            System.out.printf("No! %.2f", washer-lilisMoney);
        }
    }
}
