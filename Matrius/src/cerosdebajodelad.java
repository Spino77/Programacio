import java.util.Locale;
import java.util.Scanner;

public class cerosdebajodelad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int[][] matriu = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }

        boolean yes = false;
        int counter = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < counter; j++) {
                if (matriu[i][j] == 0) {
                    yes = true;
                } else {
                    System.out.println("NO");
                    return;
                }
            }
            counter += 1;
        }
        if (yes) {
            System.out.println("SI");
        }
    }
}
