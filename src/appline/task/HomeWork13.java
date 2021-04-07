package appline.task;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите “I love java 8 Я люблю java 14 core1”");
        String str = scan.nextLine();

        Pattern pat = Pattern.compile("([a-zA-Z]+)");
        Matcher mat = pat.matcher(str);

        while (mat.find()) {
            String str2 = mat.group();
            System.out.print(str2 +  " ");
            String[]array = str2.split(" ");
            System.out.println(array.length);
        }
        scan.close();
    }
}
