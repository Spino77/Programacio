import java.util.Locale;
import java.util.Scanner;

public class matrixarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int F = sc.nextInt();
        int C = sc.nextInt();

        int[][] matriu = new int[F][C];

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }

        int suma0 = 0;
        int suma1 = 0;

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                if (matriu[i][j] == 0) {
                    suma0 += 1;
                }
                if (matriu[i][j] == 1) {
                    suma1 += 1;
                }
            }
        }

        System.out.print(suma0 + " ");
        System.out.print(suma1);



    }
}
