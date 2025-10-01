import java.util.Locale;
import java.util.Scanner;

public class bigben {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int horaactual = sc.nextInt();
        int suma = sc.nextInt();

        int modul = suma + horaactual;
        int horafinal = modul % 12;

        System.out.println(horafinal);

    }
}
