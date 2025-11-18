import java.util.Locale;
import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int operacions = 0;

        while (N != 1) {
            if (N % 2 != 0) {
                N = N * 3 + 1;
            } else if (N % 2 == 0) {
                N = N / 2;
            }
            operacions += 1;
        }

        System.out.println(operacions);
    }
}
