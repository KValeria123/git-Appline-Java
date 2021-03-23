package appline.task;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int measure, unit;
        double quantity;

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        measure = scan.nextInt();

        if (measure == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - тонна, 4 - фунт: ");
        } else if (measure == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
        } else {
            System.out.println("Введено неверное значение");
            return;
        }

        unit = scan.nextInt();

        System.out.println("Введите число: ");
        quantity = scan.nextDouble();

        if (measure == 1 && unit == 1) {
            System.out.println("Граммы: " + quantity);
            System.out.println("Килограммы: " + quantity * 0.001);
            System.out.println("Тонны: " + quantity * 0.0000001);
            System.out.println("Фунты: " + quantity * 0.00220462);
        } else if (measure == 1 && unit == 2) {
            System.out.println("Килограммы: " + quantity);
            System.out.println("Граммы: " + quantity * 1000);
            System.out.println("Тонны: " + quantity * 0.001);
            System.out.println("Фунты: " + quantity * 2.20462);
        } else if (measure == 1 && unit == 3) {
            System.out.println("Тонны: " + quantity);
            System.out.println("Килограммы: " + quantity * 1000);
            System.out.println("Граммы: " + quantity * 1000000);
            System.out.println("Фунты: " + quantity * 2204.62);
        } else if (measure == 1 && unit == 4) {
            System.out.println("Фунты: " + quantity);
            System.out.println("Граммы: " + quantity * 453.592);
            System.out.println("Килограммы: " + quantity * 0.453592);
            System.out.println("Тонны: " + quantity * 0.000453592);
        } else if (measure == 2 && unit == 1) {
            System.out.println("Метры: " + quantity);
            System.out.println("Мили: " + quantity * 0.000621371);
            System.out.println("Ярды: " + quantity * 1.09361);
            System.out.println("Футы: " + quantity * 3.28084);
        } else if (measure == 2 && unit == 2) {
            System.out.println("Мили: " + quantity);
            System.out.println("Метры: " + quantity * 1609.34);
            System.out.println("Ярды: " + quantity * 1760);
            System.out.println("Футы: " + quantity * 5280);
        } else if (measure == 2 && unit == 3) {
            System.out.println("Ярды: " + quantity);
            System.out.println("Метры: " + quantity * 0.9144);
            System.out.println("Мили: " + quantity * 0.000568182);
            System.out.println("Футы: " + quantity * 3);
        } else if (measure == 2 && unit == 4) {
            System.out.println("Футы: " + quantity);
            System.out.println("Метры: " + quantity * 0.3048);
            System.out.println("Мили: " + quantity * 0.000189394);
            System.out.println("Ярды: " + quantity * 0.333333);
        } else {
            System.out.println("Неверно выбрана единица измерения");
            return;
        }
        scan.close();
    }
}




