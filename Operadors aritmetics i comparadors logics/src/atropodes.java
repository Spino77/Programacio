import java.util.Locale;
import java.util.Scanner;

public class atropodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int I = sc.nextInt();
        int A = sc.nextInt();
        int C = sc.nextInt();
        int M1 = sc.nextInt();
        int S1 = sc.nextInt();
        int M2 = sc.nextInt();
        int S2 = sc.nextInt();

        int total = (I * 6) + (A * 8) + (C * 10) + ((S1 * 2) * M1) + ((S2 * 4) * M2);

        System.out.print(total);

    }
}
