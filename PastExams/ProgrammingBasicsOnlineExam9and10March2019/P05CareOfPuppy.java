package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        food*=1000;
        while (!input.equals("Adopted")){
            int foodPerMeal = Integer.parseInt(input);
            food-=foodPerMeal;
            input = scanner.nextLine();
        }
        if (food>=0){
            System.out.printf("Food is enough! Leftovers: %d grams.",Math.abs(food));
        } else {
            System.out.printf("Food is not enough. You need %d grams more.%n", Math.abs(food));
        }
    }
}
