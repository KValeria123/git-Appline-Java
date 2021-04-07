package appline.task;
import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Укажите количество строк матрицы: ");
        int row = scan.nextInt();
        System.out.println("Укажите количество столбцов матрицы: ");
        int column = scan.nextInt();

        int[][] matrix = new int[column][row];

        System.out.println("Укажите через пробел элементы матрицы: ");
        for (int i = 0; i < column; i++)
            for (int j = 0; j < row; j++) {
                matrix[j][i] = scan.nextInt();
            }

        System.out.println("Элементы первой строки умноженные на 3: ");

        int[] matrix1 = new int[column];
        for (int i = 0; i < column; i++) {
            matrix1[i] = matrix[i][0];
            System.out.print(matrix1[i] * 3 + " ");
        }
        scan.close();
    }
}





