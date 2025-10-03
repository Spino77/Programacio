import java.util.Locale;
import java.util.Scanner;

public class stigidsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num = sc.nextInt();

        int num1 = num / 100;
        int num2 = num - (num1 * 100);
        int num3 = num2 / 10;


        System.out.println(num1 + "" + num2 + "" + num3);

    }
}
