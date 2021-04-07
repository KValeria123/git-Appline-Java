package appline.task;
import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число №1: ");
        String num1 = scan.next();

        System.out.println("Введите число №2: ");
        int num2 = scan.nextInt();

        int result = Integer.parseInt(num1);
        int resultInteger = Math.max(result, num2);
        System.out.println("Большее число: " + resultInteger);

        double resultDouble = Math.min(result, num2);
        System.out.println("Меньшее число: " + resultDouble);

        scan.close();
    }
}
