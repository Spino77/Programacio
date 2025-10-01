import java.util.Locale;
import java.util.Scanner;

public class c1l110comptantel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int hores = sc.nextInt();
        int minuts = sc.nextInt();

        int min_hora = (23 - hores) * 60;
        int min = 60 - minuts;
        int total = min + min_hora;

        System.out.println(total);

        /* wow */

    }
}

