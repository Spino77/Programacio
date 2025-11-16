import java.util.Locale;
import java.util.Scanner;

public class calcularfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int N2 = N - 1;
        int F = 1;

        while (N2 != 0) {
            F = F + (N * N2);
            N2 -= 1;
        }
        System.out.println(F);
    }
}
