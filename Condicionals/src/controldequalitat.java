import java.util.Locale;
import java.util.Scanner;

public class controldequalitat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean T = sc.nextBoolean();
        boolean R = sc.nextBoolean();
        boolean M = sc.nextBoolean();
        boolean E = sc.nextBoolean();
        boolean L = sc.nextBoolean();

        String Te;
        String Re;
        String Me;
        String Ee;
        String Le;

        if (T) {
            Te = "correcte";
        } else {
            Te = "defectuos";
        }

        if (R) {
            Re = "correcte";
        } else {
            Re = "defectuos";
        }

        if (M) {
            Me = "correcte";
        } else {
            Me = "defectuos";
        }

        if (E) {
            Ee = "correcte";
        } else {
            Ee = "defectuos";
        }

        if (L) {
            Le = "correcte";
        } else {
            Le = "defectuos";
        }

        System.out.println("L'estat del txasis es: " + Te);
        System.out.println("L'estat de les rodes es: " + Re);
        System.out.println("L'estat del motor es: " + Me);
        System.out.println("L'estat de l'electronica es: " + Ee);
        System.out.println("L'estat del llums es: " + Le);
        if (T && R && M && E && L) {
            System.out.println("L'estat general del cotxe es: correcte");
        } else {
            System.out.println("L'estat general del cotxe es: defectuos");
        }

    }
}
