package ForLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double startPoints = Double.parseDouble(scanner.nextLine());
        int reviews = Integer.parseInt(scanner.nextLine());
        double actorPoints = 0.0;

        for (int i = 1; i <= reviews; i++) {
            String reviewName = scanner.nextLine();
            double reviewPoints = Double.parseDouble(scanner.nextLine());
            actorPoints += reviewName.length() * reviewPoints / 2;

            if (actorPoints > 1250.50 - startPoints) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, actorPoints + startPoints);
                break;
            } else if (i == reviews) {
                System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.50 - actorPoints - startPoints);
            }
        }
    }
}
