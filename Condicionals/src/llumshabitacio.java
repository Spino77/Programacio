import java.util.Locale;
import java.util.Scanner;

public class llumshabitacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean boolean1 = sc.nextBoolean();
        boolean boolean2 = sc.nextBoolean();
        boolean boolean3 = sc.nextBoolean();

        int llum1 = boolean1 ? 1:0;
        int llum2 = boolean2 ? 1:0;
        int llum3 = boolean3 ? 1:0;

        int T = llum1 + llum2 + llum3;

        if (T == 0) {
            System.out.println("No s'ha encès cap llum.");
        } else if (T == 1) {
            System.out.println("Només hi ha un llum encès.");
        } else if (T == 2) {
            System.out.println("S'han encès dues llums.");
        } else if (T == 3) {
            System.out.println("S'han encès totes les llums.");
        }
    }
}
