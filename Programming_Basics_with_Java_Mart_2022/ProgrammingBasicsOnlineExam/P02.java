import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodForOne = Double.parseDouble(scanner.nextLine());
        double foodForTwo = Double.parseDouble(scanner.nextLine());
        double foodForThree = Double.parseDouble(scanner.nextLine());

        double foodPerDay = foodForOne + foodForTwo + foodForThree;
        double foodNeed = foodPerDay * days;

        if (foodNeed <= foodLeft) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft - foodNeed));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeed - foodLeft));
        }
    }
}
