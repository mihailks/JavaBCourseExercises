package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolii = Integer.parseInt(scanner.nextLine());
        int zumbuli = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double total = (magnolii * 3.25 + zumbuli * 4 + roses * 3.5 + cactus * 8) * 0.95;

        if (total >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(total - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - total));
        }
    }
}
