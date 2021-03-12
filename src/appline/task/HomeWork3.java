package appline.task;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 9, 12, 18, 26};
        int last = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = last;
        int first = array[0];
        int middle = array[array.length - 3];
        int result = first + middle;
            System.out.println(result);
        }
    }
