import java.util.Scanner;

public class WorkingHours {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
    if (n<10 || n>18 || day.equals("Sunday")){
        System.out.println("closed");
    }else{
        System.out.println("open");
    }
    }
}
