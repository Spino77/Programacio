import java.util.Locale;
import java.util.Scanner;

public class dossecuenciasigual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N1 = sc.nextInt();
        int array1[] = new int[N1];

        for (int i = 0; i < N1; i++) {
            array1[i] = sc.nextInt();
        }

        int N2 = sc.nextInt();
        int array2[] = new int[N2];

        for (int i = 0; i < N2; i++) {
            array2[i] = sc.nextInt();
        }

        if (N1 != N2) {
            System.out.println(false);
            return;
        }

        for (int i = 0; i < N1; i++) {
            if (array1[i] != array2[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
