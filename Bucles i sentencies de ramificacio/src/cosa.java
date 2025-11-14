import java.util.Locale;
import java.util.Scanner;

public class cosa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        long num = 100000000;

        for (long i = 0; i < num; i++) {
            System.out.println(i);
            for (long a = 0; a < num; a++) {
                System.out.println(a);
            }        }
    }
}
