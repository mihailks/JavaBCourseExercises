import java.util.Scanner;

public class SmallShop {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        String city = scanner.nextLine();
        double quan = Double.parseDouble(scanner.nextLine());
        Double price = 0.0;


        if (city.equals("Sofia")) {
            switch (item){
                case "coffee":
                    price = 0.5;
                    break;
                case "water":
                    price = 0.8;
                    break;
                case "beer":
                    price = 1.20;
                    break;
                case "sweets":
                    price = 1.45;
                    break;
                case "peanuts":
                    price = 1.6;
                    break;
            }
        }
        if (city.equals("Plovdiv")) {
            switch (item){
                case "coffee":
                    price = 0.4;
                    break;
                case "water":
                    price = 0.7;
                    break;
                case "beer":
                    price = 1.15;
                    break;
                case "sweets":
                    price = 1.30;
                    break;
                case "peanuts":
                    price = 1.50;
                    break;
            }
        }
        if (city.equals("Varna")) {
            switch (item){
                case "coffee":
                    price = 0.45;
                    break;
                case "water":
                    price = 0.7;
                    break;
                case "beer":
                    price = 1.10;
                    break;
                case "sweets":
                    price = 1.35;
                    break;
                case "peanuts":
                    price = 1.55;
                    break;
            }
        }


        System.out.println(price*quan);
    }
}
