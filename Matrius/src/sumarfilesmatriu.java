import java.util.Locale;
import java.util.Scanner;

public class sumarfilesmatriu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int colum = sc.nextInt();
        int N = sc.nextInt();

        int[][] matriu = new int[colum][N];

        for (int i = 0; i < colum; i++) {
            for (int j = 0; j < N; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < colum; i++) {
            int suma = 0;
            for (int j = 0; j < N; j++) {
                suma += matriu[i][j];
            }
            System.out.println(suma);
        }


    }
}
