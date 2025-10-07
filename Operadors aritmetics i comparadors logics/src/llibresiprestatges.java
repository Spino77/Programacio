import java.util.Locale;
import java.util.Scanner;

public class llibresiprestatges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int N = sc.nextInt();

        int total = P * (Q * R);

        boolean A = N <= total;

        System.out.println(A);

    }
}
