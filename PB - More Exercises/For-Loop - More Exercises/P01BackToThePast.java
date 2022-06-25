package ForLoopMoreExercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = Double.parseDouble(scanner.nextLine());
        int endYear = Integer.parseInt(scanner.nextLine());

        for (int i = 1800; i <= endYear; i++) {
            if (i%2==0){
                totalMoney -=12000;
            }else{
                totalMoney -= 12000+50*(i-1800+18);
            }
        }
        if (totalMoney>=0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",totalMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(totalMoney));
        }

    }
}
