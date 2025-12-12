import java.util.Locale;
import java.util.Scanner;

public class ordenarsecuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (array[j] > array[i]) {
                    int jn = array[j];
                    int in = array[i];
                    array[j] = in;
                    array[i] = jn;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
