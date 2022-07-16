import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transport = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        double sumPerPerson = 20*nights+transport*1.6+tickets*6;
        sumPerPerson*=1.25;
        double totalSum = people*sumPerPerson;
        System.out.printf("%.2f",totalSum);



    }
}
