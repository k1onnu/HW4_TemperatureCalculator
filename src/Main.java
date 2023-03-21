import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите температуру по цельсию: ");

        Scanner scanner = new Scanner(System.in);
        double tempC = scanner.nextDouble();
        double formul = tempC * 1.8 + 32;
        if(tempC > 0 || tempC < 0) {
            System.out.println("Температура по фарингейту: " + (formul));
        } else {
        }
    }
}