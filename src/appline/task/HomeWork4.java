package appline.task;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double x, y, z, average, result;
        System.out.print("Enter number x: ");
        x = num.nextDouble();
        System.out.print("Enter number y: ");
        y = num.nextDouble();
        System.out.print("Enter number z: ");
        z = num.nextDouble();
        average = ((x+y+z)/3);
        System.out.println("Average is " + average);
        result = Math.floor(average/2);

        if (result>3)
            System.out.println("Программа выполнена корректно");
    }
}
