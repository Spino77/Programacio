import java.util.Locale;
import java.util.Scanner;

public class arrodonirlanota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float nota = sc.nextFloat();

        int nota2 = (int) nota;

        boolean mayorque05 = (nota - nota2) >= 0.5;

        int notaarrodonida = nota2;

        if (mayorque05) {
            notaarrodonida = nota2 + 1;
        }

        System.out.println(notaarrodonida);


    }
}
