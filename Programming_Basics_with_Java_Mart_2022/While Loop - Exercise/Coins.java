package WhileLoopExercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int coins = 0;
        money = money*1000;

        while (money > 0){
            if (money>=2000){
                while (money>=2000){
                    money-=2000;
                    coins++;
                }
            }
            if (money<2000 && money>=1000){
                while ((money<2000 && money>=1000)){
                    money-=1000;
                    coins++;
                }
            }
            if (money<1000 && money>=500){
                while ((money<1000 && money>=500)){
                    money-=500;
                    coins++;
                }
            }
            if (money<500 && money>=200){
                while ((money<500 && money>=200)){
                    money-=200;
                    coins++;
                }
            }
            if (money<200 && money>=100){
                while ((money<200 && money>=100)){
                    money-=100;
                    coins++;
                }
            }
            if (money<100 && money>=50){
                while ((money<100 && money>=50)){
                    money-=50;
                    coins++;
                }
            }
            if (money<50 && money>=20){
                while ((money<50 && money>=20)){
                    money-=20;
                    coins++;
                }
            }
            if (money<20 && money>=10){
                while ((money<20 && money>=10)){
                    money-=10;
                    coins++;
                }
            }
        }
        System.out.println(coins);
    }
}
