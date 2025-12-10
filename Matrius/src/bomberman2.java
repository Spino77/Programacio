import java.util.Locale;
import java.util.Scanner;

public class bomberman2 {
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

        int num = sc.nextInt();
        int i_numID = 0;
        int j_numID = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matriu[i][j] == num) {
                    i_numID = i;
                    j_numID = j;
                }
            }
        }

        String[][] matriu2 = new String[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == i_numID || j == j_numID) {
                    matriu2[i][j] = "@";
                } else {
                    matriu2[i][j] = "#";
                }

            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriu2[i][j]);
            }
            System.out.println("");
        }
    }
}
