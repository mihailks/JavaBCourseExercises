import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        boolean isValid = true;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (item.equals("banana")) {
                    price = 2.50 * quantity;
                }else if (item.equals("apple")) {
                    price = 1.20 * quantity;
                }else if(item.equals("orange")) {
                    price = 0.85 * quantity;
                }else if(item.equals("grapefruit")) {
                    price = 1.45 * quantity;
                }else if(item.equals("kiwi")) {
                    price = 2.70 * quantity;
                }else if(item.equals("pineapple")) {
                    price = 5.50 * quantity;
                }else if(item.equals("grapes")) {
                    price = 3.85 * quantity;
                }else {
                    isValid = false;

//                    case "banana":
//                        price = 2.50 * quantity;
//                        break;
//                    case "apple":
//                        price = 1.20 * quantity;
//                        break;
//                    case "orange":
//                        price = 0.85 * quantity;
//                        break;
//                    case "grapefruit":
//                        price = 1.45 * quantity;
//                        break;
//                    case "kiwi":
//                        price = 2.70 * quantity;
//                        break;
//                    case "pineapple":
//                        price = 5.50 * quantity;
//                        break;
//                    case "grapes":
//                        price = 3.85 * quantity;
//                        break;
//                    default:
//                        isValid = false;
                } break;
            case "Saturday":
            case "Sunday":
                if (item.equals("banana")) {
                    price = 2.70 * quantity;
                }else if (item.equals("apple")) {
                    price = 1.25 * quantity;
                }else if(item.equals("orange")) {
                    price = 0.90 * quantity;
                }else if(item.equals("grapefruit")) {
                    price = 1.60 * quantity;
                }else if(item.equals("kiwi")) {
                    price = 3.00 * quantity;
                }else if(item.equals("pineapple")) {
                    price = 5.60 * quantity;
                }else if(item.equals("grapes")) {
                    price = 4.20 * quantity;
                }else {
                    isValid = false;

//                switch (item) {
//                    case "banana":
//                        price = 2.70 * quantity;
//                        break;
//                    case "apple":
//                        price = 1.25 * quantity;
//                        break;
//                    case "orange":
//                        price = 0.90 * quantity;
//                        break;
//                    case "grapefruit":
//                        price = 1.60 * quantity;
//                        break;
//                    case "kiwi":
//                        price = 3.00 * quantity;
//                        break;
//                    case "pineapple":
//                        price = 5.60 * quantity;
//                        break;
//                    case "grapes":
//                        price = 4.20 * quantity;
//                        break;
//                    default:
//                        isValid = false;
                }break;
            default:
                isValid = false;
        }

        if (isValid) {
            System.out.printf("%.2f", price);
        }else System.out.println("error");

    }
}
