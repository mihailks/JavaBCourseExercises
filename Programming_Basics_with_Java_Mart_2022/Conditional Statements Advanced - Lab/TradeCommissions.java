import java.util.Scanner;

public class TradeCommissions {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double com = 0.0;

    boolean isValid = true;

        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    com = 0.05 * sales;
                } else if (sales > 500 && sales <= 1000) {
                    com = 0.07 * sales;
                } else if (sales > 1000 && sales <= 10000) {
                    com = 0.08 * sales;
                } else if (sales > 10000) {
                    com = 0.12 * sales;
                }else{
                    isValid = false;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    com = 0.045 * sales;
                } else if (sales > 500 && sales <= 1000) {
                    com = 0.075 * sales;
                } else if (sales > 1000 && sales <= 10000) {
                    com = 0.1 * sales;
                } else if (sales > 10000) {
                    com = 0.13 * sales;
                }else{
                    isValid = false;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    com = 0.055 * sales;
                } else if (sales > 500 && sales <= 1000) {
                    com = 0.08 * sales;
                } else if (sales > 1000 && sales <= 10000) {
                    com = 0.12 * sales;
                } else if (sales > 10000) {
                    com = 0.145 * sales;
                } else{
                    isValid = false;
                }
                break;
            default:
                isValid = false;
        }



    if (isValid){
        System.out.printf("%.2f",com);
    }else
        System.out.println("error");
    }
}
