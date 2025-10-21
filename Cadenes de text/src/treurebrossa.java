import java.util.Locale;
import java.util.Scanner;

public class treurebrossa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String P1 = sc.nextLine();
        String P2 = sc.nextLine();

        String ayuda = P1.substring(1);
        int llargada = P2.length();
        int numalgo = llargada - 2;

        String ayuda2 = P2.substring(0, numalgo);

        int num1 = Integer.parseInt(ayuda);
        int num2 = Integer.parseInt(ayuda2);
        int suma = num1 + num2;

        System.out.println(suma);

    }
}
