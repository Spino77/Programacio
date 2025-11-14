import java.util.Locale;
import java.util.Scanner;

public class c3l02interval_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();

        while (A < B) {
            System.out.print(A);
            A = A + 1;
        }
    }
}
