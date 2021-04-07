package appline.task;
import java.util.Arrays;

public class HomeWork14 {
    public static void main(String[] args) {
        int[] array;
        array = new int[15];
        for (int i=0; i<array.length; i++) {
            array[i] = ((int) (Math.random() * 41) - 20);
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        System.out.println();

        int min = array[0];
        System.out.println("Минимальное значение: " + min);
        int max = array[14];
        System.out.println("Максимальное значение: " + max);

        int resultMin = Math.abs(min);
        int resultMax = Math.abs(max);

        if (resultMin>resultMax) {
            System.out.println("Наибольшее значение по модулю: " + min);
        }
        else {
            System.out.println("Наибольшее значение по модулю: " + max);
        }
    }
}
