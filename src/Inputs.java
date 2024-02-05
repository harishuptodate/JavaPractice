import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cars = input.next();
        int type = input.nextInt();
        switch (cars) {
            case "suzuki" -> System.out.println("cheap");
            case "audi" -> System.out.println("midrange");
            case "Mercedes" -> {
                System.out.println("costly");
                switch (type) {
                    case 1 -> System.out.println("sedan");
                    case 2 -> System.out.println("SUV");
                    case 3 -> System.out.println("Sports");
                    default -> System.out.println("theres no such type");
                }
            }
            default -> System.out.println("Its not a car");
        }
    }
}