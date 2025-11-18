import java.util.Locale;
import java.util.Scanner;

public class sumarparells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Quantitat = sc.nextInt();
        int N = 0;
        int SUMA = 0;

        while (Quantitat > 0) {
            N = sc.nextInt();
            if (N % 2 == 0) {
                SUMA += N;
            }
            Quantitat -= 1;
        }
        System.out.println(SUMA);
    }
}
