import java.util.Locale;
import java.util.Scanner;

public class calcularfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int a = 1;
        int b = 0;
        int c = 0;

        while (N != 0) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(" " + c);
            N -= 1;
        }
    }
}
