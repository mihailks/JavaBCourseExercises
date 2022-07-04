package ProgrammingBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class P0402Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int high = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int noGoZone = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int liters = 0;
        double area = high*width*4;
        area -= area*(noGoZone*1.0/100);
        double totalLiters = 0;
        while (!input.equals("Tired!")){
            liters=Integer.parseInt(input);
            totalLiters +=liters;
            if (totalLiters>=area){
                break;
            }
            input=scanner.nextLine();
        }
        if (input.equals("Tired!")){
            System.out.printf("%.0f quadratic m left.",Math.ceil(area-totalLiters));
        } else if ((area-totalLiters)<0){
            System.out.printf("All walls are painted and you have %.0f l" +
                    " paint left!",Math.ceil(totalLiters-area));
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
