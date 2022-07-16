import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalRakiq = 0;
        double totalDegree = 0;
        for (int i = 1; i <= days; i++) {
            double rakiq = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());

            totalRakiq += rakiq;
            totalDegree += rakiq * degree;

        }
        double finalDegree = totalDegree / totalRakiq;

        System.out.printf("Liter: %.2f\n", totalRakiq);
        System.out.printf("Degrees: %.2f\n", finalDegree);
        if (finalDegree < 38) {
            System.out.println("Not good, you should baking!");
        } else if (38 <= finalDegree && finalDegree <= 42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
        System.out.println();
    }
}
