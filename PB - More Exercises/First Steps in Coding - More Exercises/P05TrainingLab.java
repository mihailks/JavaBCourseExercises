package FirstStepsinCodingMoreExercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        h = h-1;

        double seatsPerRow = Math.floor(h/0.7);
        double rows = Math.floor(w/1.2);

        System.out.println(seatsPerRow*rows-3);
    }
}
