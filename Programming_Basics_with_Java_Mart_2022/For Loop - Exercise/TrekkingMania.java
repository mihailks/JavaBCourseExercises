package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;
        double musala = 0.0;
        double monblan = 0.0;
        double kilimandjaro = 0.0;
        double k2 = 0.0;
        double everest = 0.0;

        for (int i = 1; i <= groups; i++) {
            int peoplePerGroup = Integer.parseInt(scanner.nextLine());
            totalPeople += peoplePerGroup;
            if (peoplePerGroup <= 5) {
                musala +=peoplePerGroup;
            }else if (peoplePerGroup <= 12) {
                monblan +=peoplePerGroup;
            }else if (peoplePerGroup <= 25) {
                kilimandjaro +=peoplePerGroup;
            }else if (peoplePerGroup <= 40) {
                k2 +=peoplePerGroup;
            }else {
                everest +=peoplePerGroup;
            }
        }
        System.out.printf("%.2f%%%n",musala/totalPeople*100);
        System.out.printf("%.2f%%%n",monblan/totalPeople*100);
        System.out.printf("%.2f%%%n",kilimandjaro/totalPeople*100);
        System.out.printf("%.2f%%%n",k2/totalPeople*100);
        System.out.printf("%.2f%%%n",everest/totalPeople*100);
    }
}
