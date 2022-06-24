package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        double pricePerKm = 0.0;

        if (n<20){
            if (timeOfDay.equals("day")){
                pricePerKm = 0.79;
            }else {
                pricePerKm = 0.90;
            }
        } else if (n>=100){
            pricePerKm = 0.06;
        } else {
            pricePerKm=0.09;
        }
        if (n<20){
            System.out.printf("%.2f", pricePerKm*n + 0.70);
        } else {
            System.out.printf("%.2f", pricePerKm*n);
        }

    }
}
