import java.util.Locale;
import java.util.Scanner;

public class arrayindexoutof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int[] Nn = new int[N];
        for (int i = 0; i < N; i++) {
            Nn[i] = sc.nextInt();
        }

        int I = sc.nextInt();

        try {
            System.out.println(Nn[I]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Aquesta posició no existeix dins l'array.");
        }

    }
}
