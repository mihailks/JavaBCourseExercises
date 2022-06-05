import java.util.Scanner;

public class AnimalType {
    static public void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String type = scanner.nextLine();

    switch (type){
        case "dog":
            System.out.println("mammal");
            break;
        case "crocodile":
        case "tortoise":
        case "snake":
            System.out.println("reptile");
            break;
        default:
            System.out.println("unknown");
    }
}
}
