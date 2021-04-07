package appline.task;
import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите “I like Java!!!”");
        String str = scan.nextLine();

        boolean str1 = str.contains("Java");
        System.out.println("Строка содержит 'Java': " + str1);
        boolean str2 = str.startsWith("I like");
        System.out.println("Строка начинается с подстроки 'I like': " + str2);
        boolean str3 = str.endsWith("!!!");
        System.out.println("Строка заканчивается '!!!': " + str3);

        if (str1==true && str2==true && str3==true) {
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println("Не все условия верны");
            return;
        }

        String change = str.replace('a', 'o');
        String result = change.substring(7,11);
        System.out.println(result);

        scan.close();
    }
}
