import java.util.Locale;
import java.util.Scanner;

public class buscandominas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] bombas = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bombas[i][j] = sc.nextInt();
            }
        }

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        while (N1 != 0 && N2 != 0) {
            if (bombas[N1 - 1][N2 - 1] == 1) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }


            N1 = sc.nextInt();
            N2 = sc.nextInt();
        }
    }
}
