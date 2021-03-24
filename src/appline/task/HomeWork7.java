package appline.task;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 5;
        int y = 18;
        int z = 34;

        System.out.println("Укажите размер массива: ");
        int size = scan.nextInt();
        double[] array = new double[size];
        System.out.println("Укажите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextDouble();
        }

        System.out.println ("Элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.print (array[i]);
            System.out.println();
            if (array[i] == x | array[i] == y | array[i] == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
        scan.close();
    }
}
