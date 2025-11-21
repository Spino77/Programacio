import java.util.Locale;
import java.util.Scanner;

public class obrircandau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int total = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        while (c != -1) {
            if ((a + b) * c == total) {
                System.out.println("true");
                return;
            }
            a = b;
            b = c;
            c = sc.nextInt();
        }
        System.out.println("false");
    }
}
