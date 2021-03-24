package appline.task;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введите любое целое положительное число: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
            sum += i;
            System.out.println("Сумма нечётных чисел = " + sum);
        }
        scan.close();
    }
}


