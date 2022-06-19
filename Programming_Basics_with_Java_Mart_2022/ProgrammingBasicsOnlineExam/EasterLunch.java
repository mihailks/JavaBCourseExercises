package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakes = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());



        double cakesPrice = cakes * 3.2;
        double eggPrice = eggs * 4.35;
        double cookiesPrice = cookies * 5.40;
        double paintPrice = eggs * 12 * 0.15;
        double totalPrice = cakesPrice+eggPrice+cookiesPrice+paintPrice;
        System.out.printf("%.2f", totalPrice);


    }
}
