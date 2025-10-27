import java.util.Locale;
import java.util.Scanner;

public class algo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        long hola = sc.nextInt();

        if (hola == 7) {
            System.out.println("Hola");
        } else {
            for (long i = 1; i <= hola; i++) {
                System.out.println("tonto");
            }
        }

    }
}
