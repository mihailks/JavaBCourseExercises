package WhileLoopLab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();

        String passAtempt = scanner.nextLine();

        while (!password.equals(passAtempt)){
            passAtempt = scanner.nextLine();
        }
        System.out.println("Welcome "+ userName + "!");
    }
}
