import java.util.Scanner;

public class PersonalTitels {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        char sex = scanner.next().charAt(0);

        if (age>=16 && sex=='m'){
            System.out.println("Mr.");
        } else if (age<16 && sex=='m') {
            System.out.println("Master");
        } else if (age>=16 && sex=='f') {
            System.out.println("Ms.");
        } else if (age<16 && sex=='f') {
            System.out.println("Miss");
        }
    }
}
