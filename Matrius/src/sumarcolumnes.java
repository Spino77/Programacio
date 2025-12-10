import java.util.Locale;
import java.util.Scanner;

public class sumarcolumnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matriu = new int[N][M];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < M; i++) {
            int suma = 0;
            for (int j = 0; j < N; j++) {
                suma += matriu[j][i];
            }
            System.out.print(suma + " ");
        }
    }
}
