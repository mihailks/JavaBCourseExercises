package FirstStepsinCodingMoreExercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenPaintNorm = 3.4;
        double redPaintNorm = 4.3;

        double sides = x*x-1.2*2 + x*x + 2*(x*y-1.5*1.5);
        double roof = h*x*1.0/2 + h*x*1.0/2 + 2*(x*y);

        System.out.printf("%.2f%n", sides/greenPaintNorm);
        System.out.printf("%.2f", roof/redPaintNorm);


    }
}
