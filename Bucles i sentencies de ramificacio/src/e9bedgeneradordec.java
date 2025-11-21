import java.util.Locale;
import java.util.Scanner;

public class e9bedgeneradordec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int a = sc.nextInt();
        int b = sc.nextInt();

        bucle:
        while (b != 0) {
            if (a >= b) {
                System.out.println("INCORRECTE");
                return;
            }

            a = b;
            b = sc.nextInt();
            if (b == 0) {
                break bucle;
            }

            if (b >= a) {
                System.out.println("INCORRECTE");
                return;
            }
            a = b;
            b = sc.nextInt();
            if (b == 0) {
                break bucle;
            }
        }
        System.out.println("CORRECTE");
    }
}
