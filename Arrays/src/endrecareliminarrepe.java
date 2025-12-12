import java.util.Locale;
import java.util.Scanner;

public class endrecareliminarrepe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();

        int[] array = new int[N];
        int[] noRepe = new int[N];


        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < N; i++) {
            boolean repetit = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == (array[j])) {
                    repetit = true;
                }
            }
            if (!repetit) {
                noRepe[counter] = array[i];
                counter += 1;
            }
        }

        for (int i = 0; i < counter; i++) {
            for (int j = 0; j < N; j++) {
                if (noRepe[j] > noRepe[i]) {
                    int jn = noRepe[j];
                    int in = noRepe[i];
                    noRepe[j] = in;
                    noRepe[i] = jn;
                }
            }
        }
        for (int i = 0; i < counter; i++) {
            System.out.print(noRepe[i] + " ");
        }

    }
}
