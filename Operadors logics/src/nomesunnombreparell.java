import java.util.Locale;
import java.util.Scanner;

public class nomesunnombreparell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean n1 = (num1 % 2) == 0;
        boolean n2 = (num2 % 2) == 0;
        boolean n3 = (num3 % 2) == 0;

        int b1 = n1 ? 1 : 0;
        int b2 = n2 ? 1 : 0;
        int b3 = n3 ? 1 : 0;

        boolean parell = (b1 + b2 + b3) == 1;

        System.out.println(parell);

    }
}
