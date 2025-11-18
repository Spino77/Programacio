import java.util.Locale;
import java.util.Scanner;

public class dividirimultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float N = sc.nextFloat();
        float M = sc.nextFloat();

        float NS = N;
        float C = N;

        while (C <= M) {
            System.out.print(N);

            if (NS % 2 == 0) {
                NS = NS / (NS - 1);
            } else if (NS % 2 != 0) {
                NS = NS * (NS + 1);
            }

            C += 1;
        }


    }
}
