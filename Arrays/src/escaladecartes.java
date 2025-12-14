import java.util.Locale;
import java.util.Scanner;

public class escaladecartes {
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
                if (array[j] < array[i]) {
                    int jn = array[j];
                    int in = array[i];
                    array[j] = in;
                    array[i] = jn;
                }
            }
        }

        boolean escala = true;
        int tmp = array[0];

        if (N != 0) {
            for (int i = 1; i < N; i++) {
                if (array[i] != (tmp - 1)) {
                    escala = false;
                    break;
                }
                tmp = array[i];
            }
        }

        int gran = array[0];
        int petita = array[N - 1];
        int mig = array[N / 2];

        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("");
        System.out.println("La carta més gran és: " + gran);
        System.out.println("La carta més petita és: " + petita);
        System.out.println("La carta del mig és: " + mig);

        if (escala) {System.out.println("Es tracta d'una escala: SI");
        } else {System.out.println("Es tracta d'una escala: NO");}

    }
}
