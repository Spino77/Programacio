import java.util.Locale;
import java.util.Scanner;

public class matrixsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();

        String[][] matriu = new String[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriu[i][j] = sc.next();
            }
        }

        int S = sc.nextInt();
        int E = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int length = matriu[i][j].length() - 1;

                if (length >= E) {
                    System.out.print(matriu[i][j].substring(S, E) + " ");
                } else {
                    System.out.print("<ERROR>" + " ");
                }
            }
            System.out.println("");
        }
    }
}
