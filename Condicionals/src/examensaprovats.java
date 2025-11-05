import java.util.Locale;
import java.util.Scanner;

public class examensaprovats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();

        boolean A1 = N1 >= 5;
        boolean A2 = N2 >= 5;
        boolean A3 = N3 >= 5;

        int F1 = A1 ? 1 : 0;
        int F2 = A2 ? 1 : 0;
        int F3 = A3 ? 1 : 0;

        int TOTAL = F1 + F2 + F3;

        if (TOTAL == 0) {
            System.out.println("No s'ha aprovat cap examen.");
        } else if (TOTAL == 1) {
            System.out.println("S'ha aprovat un examen.");
        } else if (TOTAL == 2) {
            System.out.println("S'han aprovat dos exàmens.");
        } else if (TOTAL == 3) {
            System.out.println("S'han aprovat tots els exàmens.");
        }
    }
}
