package appline.task;
import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;

        System.out.println("Укажите размер массива: ");
        int size = scan.nextInt();
        double[] array = new double[size];
        System.out.println("Укажите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextDouble();
            sum += array[i];
        }

        double average = sum/size;

        System.out.println("Элементы массива умноженные на среднее арифметическое: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] * average);
        }
        scan.close();
    }
}

