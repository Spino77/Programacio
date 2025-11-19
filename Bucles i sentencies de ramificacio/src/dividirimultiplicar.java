import java.util.Locale;
import java.util.Scanner;

public class dividirimultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float N = sc.nextFloat();
        float M = sc.nextFloat();

        float count = N;
        float NA = N;

        while (count <= M) {
            NA += 1;

            System.out.print(N + " ");

            if ((NA % 2) == 0) {
                N = N / NA;
            } else if ((NA % 2 != 0)) {
                N = N * NA;
            }
            count += 1;
        }
    }
}
