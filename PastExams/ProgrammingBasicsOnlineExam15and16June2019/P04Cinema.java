package ProgrammingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentPPL=0;
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Movie time!")){
            int people = Integer.parseInt(input);
            currentPPL +=people;
            if (n<=currentPPL){
                System.out.println("The cinema is full.");
                break;
            }
            input = scanner.nextLine();
        }
        double totalPrice;
        if (currentPPL%3==0){
            totalPrice = currentPPL*5-5;
        } else {
            totalPrice = currentPPL*5;
        }
        if (input.equals("Movie time")){
            System.out.printf("There are %d seats left in the cinema.",n-currentPPL);
        }
        System.out.printf("Cinema income - %.2f lv.",totalPrice);
    }
}
