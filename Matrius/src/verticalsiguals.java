import java.util.Locale;
import java.util.Scanner;

public class verticalsiguals {
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

        boolean igual = false;

        for (int i = 0; i < M; i++) {
            igual = false;
            int num = matriu[0][i];
            for (int j = 0; j < N; j++) {
                if (matriu[j][i] != num) {
                    igual = false;
                    break;
                } else {
                    igual = true;
                }
            }
            if (igual) {
                System.out.println("La columna " + i + " té tots els números iguals.");
                return;
            }
        }

        System.out.println("No hi ha cap columna amb els números iguals.");


    }
}
