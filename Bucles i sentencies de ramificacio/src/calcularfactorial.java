import java.util.Locale;
import java.util.Scanner;

public class calcularfactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int N2 = N - 1;
        int F = N;

        if (N != 0) {
            while (N2 != 0) {
                F = F * N2;
                N2 -= 1;
            }
            System.out.println(F);
        } else if (N == 0) {
            System.out.println("1");
        }
    }
}
