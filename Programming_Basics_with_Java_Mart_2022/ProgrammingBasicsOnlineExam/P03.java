import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String time = scanner.nextLine();
        double price = 0.0;
        if (n<=5){
            switch (time){
                case "spring":
                    price=50;
                    break;
                case "summer":
                    price=48.50;
                    break;
                case "autumn":
                    price=60;
                    break;
                case "winter":
                    price=86;
                    break;
            }
        } else {
            switch (time){
                case "spring":
                    price=48;
                    break;
                case "summer":
                    price=45;
                    break;
                case "autumn":
                    price=49.50;
                    break;
                case "winter":
                    price=85;
                    break;
            }
        }
        double total = price*n;

        if (time.equals("summer")){
            total*=0.85;
        } else if (time.equals("winter")){
            total*=1.08;
        }
        System.out.printf("%.2f leva.", total);

    }
}
