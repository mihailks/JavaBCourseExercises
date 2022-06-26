package ForLoopMoreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int totalLoad = 0;
        int microBus = 0;
        int truck = 0;
        int train = 0;
        double price = 0.0;
        for (int i = 0; i < n; i++) {
            int load = Integer.parseInt(scanner.nextLine());
            if (load <= 3) {
                microBus += load;
                price+=load*200;
            } else if (load <= 11) {
                truck+=load;
                price+=load*175;
            }else {
                train+=load;
                price+=load*120;
            }
        }
        totalLoad = microBus+truck+train;
        System.out.printf("%.2f%n",price/totalLoad);
        System.out.printf("%.2f%%%n",microBus*1.0/totalLoad*100);
        System.out.printf("%.2f%%%n",truck*1.0/totalLoad*100);
        System.out.printf("%.2f%%%n",train*1.0/totalLoad*100);
    }
}
