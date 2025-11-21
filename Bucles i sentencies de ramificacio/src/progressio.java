import java.util.Locale;
import java.util.Scanner;

public class progressio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean hola = false;

        int progresio = b - a;

        while (N != 1) {
            if (a + progresio == b) {
                hola = true;
            } else {
                hola = false;
                break;
            }

            N -= 1;

            if (N == 1) {
                break;
            }

            a = b;
            b = sc.nextInt();

        }

        if (hola == true) {
            System.out.println("si");
        } else if (hola == false) {
            System.out.println("no");
        }


    }
}
