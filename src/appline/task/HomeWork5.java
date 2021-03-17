package appline.task;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1, num2;
        String chooseSign;
        char sign;

        System.out.print("Введите число 1: ");
        num1 = scan.nextFloat();
        System.out.print("Введите число 2: ");
        num2 = scan.nextFloat();
        System.out.print("Введите символ +, -, * или /: ");
        chooseSign = scan.next();
        sign = chooseSign.charAt(0);

        switch (sign){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Введён неверный символ");
        }
    }
}
