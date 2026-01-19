import java.util.Locale;
import java.util.Scanner;

public class esborrarlletresv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int F = sc.nextInt();
        int C = sc.nextInt();

        String[][] S = new String[F][C];
        int[][] N = new int[F][C];

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                S[i][j] = sc.next();
            }
        }
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                N[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                String P = S[i][j];
                int L = P.length();
                int n = N[i][j];

                if (n < L) {
                    P = P.substring(0 , n) + P.substring(n + 1);
                }
                System.out.print(P + " ");
            }
            System.out.println();
        }
    }
}