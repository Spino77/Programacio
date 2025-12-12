import java.util.Locale;
import java.util.Scanner;

public class matrixlowerupper {
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

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                while () {
                    int cosa = sc.nextInt();
                    int length = matriu[i][j].length();

                    if (cosa >= 0) {
                        String S1 = matriu[i][j].substring(0, cosa);
                        String S2 = matriu[i][j].substring(cosa, cosa + 1).toUpperCase();
                        String S3 = matriu[i][j].substring(cosa + 1, length);
                        matriu[i][j] = S1 + S2 + S3;
                    } else {
                        cosa = cosa * -1;
                        String S1 = matriu[i][j].substring(0, cosa);
                        String S2 = matriu[i][j].substring(cosa, cosa + 1).toLowerCase();
                        String S3 = matriu[i][j].substring(cosa + 1, length);
                        matriu[i][j] = S1 + S2 + S3;
                    }
                }

            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
