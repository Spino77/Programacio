import java.util.Locale;
import java.util.Scanner;

public class elultimoquesume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int LN = array[N - 1];

        for (int i = 0; i < N; i++) {
            int sum = array[i] + LN;
            System.out.print(sum + " ");
        }

    }
}
