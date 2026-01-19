import java.util.Locale;
import java.util.Scanner;

public class unadinslaltrav2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int F = sc.nextInt();
        int C = sc.nextInt();

        String[][] matriu = new String[F][C];

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                matriu[i][j] = sc.next();
            }
        }
        sc.nextLine();
        String frase = sc.nextLine();
        String[] array = frase.split(" ");
        int length = array.length;

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                String P = matriu[i][j];
                System.out.print(P + ": ");
                for (int k = 0; k < length; k++) {
                    String SP = array[k];
                    if (P.contains(SP)) {
                        System.out.print(SP + " ");
                    }
                }
                System.out.println();

            }
        }
    }
}
