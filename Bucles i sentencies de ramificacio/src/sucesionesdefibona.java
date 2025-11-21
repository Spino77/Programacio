import java.util.Locale;
import java.util.Scanner;

public class sucesionesdefibona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Quantitat = sc.nextInt();

        boolean continua = true;
        boolean resultat = false;

        while (Quantitat != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0) {
                while (continua = true) {
                    if (a + b == sc.nextInt()) {
                        resultat = true;
                    } else {
                        resultat = false;
                    }
                    a = b;
                    b = sc.nextInt();
                    if (b == -1) {
                        continua = false;
                    }
                }
            } else {
                while (continua = true) {
                    if (a + b == sc.nextInt()) {
                        resultat = false;
                    } else {
                        resultat = false;
                    }
                    a = b;
                    b = sc.nextInt();
                    if (b == -1) {
                        continua = false;
                    }
                }
            }

            Quantitat -= 1;
            System.out.println(resultat);
        }
    }
}
