package ForLoopMoreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int docs = 7;
        int patientsLeft = 0;
        int stayed = 0;
        int left = 0;
        for (int i = 0; i < period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if ((i + 1) % 3 == 0) {
                if (left > docs) {
                    docs++;
                }
            }
            if (patients <= docs) {
                stayed += patients;
            } else {
                stayed += docs;
            }
            if (docs < patients) {
                left += patients - docs;
            }
        }
        System.out.printf("Treated patients: %d.%n", stayed);
        System.out.printf("Untreated patients: %d.", left);
    }
}
