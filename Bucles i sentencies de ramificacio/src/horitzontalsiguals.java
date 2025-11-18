import java.util.Locale;
import java.util.Scanner;

public class horitzontalsiguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Files = sc.nextInt();
        int fila_actual = 0;
        int Columnes = sc.nextInt();
        int N = 0;

        while (Files > 0) {
            while (Columnes > 0) {
                N = sc.nextInt();


                Columnes -= 1;
            }
            fila_actual += 1;
            Files -= 1;
        }


    }
}
