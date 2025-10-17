import java.util.Locale;
import java.util.Scanner;

public class primerdecimalparell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float num = sc.nextFloat();
        float num_mes_1rdecimal = (num * 10);
        int decimal = (int)num_mes_1rdecimal % 10;
        int parell = (decimal % 2);
        boolean hola = parell == 0;

        System.out.println(hola);

    }
}
