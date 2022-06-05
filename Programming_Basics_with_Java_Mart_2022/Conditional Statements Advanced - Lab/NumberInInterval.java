import java.util.Scanner;

public class NumberInInterval {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n!=0 && n<=100 && n>=-100){
            System.out.println("Yes");

        }else {
            System.out.println("No");
        }

    }
}
