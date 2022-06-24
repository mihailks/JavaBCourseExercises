package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMount = Double.parseDouble(scanner.nextLine());
        double salary=0.0;

        if (kmPerMount<=5000){
            if (season.equals("Spring") || season.equals("Autumn")){
                salary = kmPerMount * 0.75;
            } else if (season.equals("Summer")){
                salary = kmPerMount * 0.90;
            } else {
                salary = kmPerMount * 1.05;
            }
        } else if (kmPerMount<=10000){
            if (season.equals("Spring") || season.equals("Autumn")){
                salary = kmPerMount * 0.95;
            } else if (season.equals("Summer")){
                salary = kmPerMount * 1.10;
            } else {
                salary = kmPerMount * 1.25;
            }
        } else if (kmPerMount<=20000){
            salary = kmPerMount * 1.45;
        }
        salary *= 4*0.9;
        System.out.printf("%.2f",salary);
    }
}
