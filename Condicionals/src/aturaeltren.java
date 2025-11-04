import java.util.Locale;
import java.util.Scanner;

public class aturaeltren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String S = sc.nextLine();
        int P = sc.nextInt();
        boolean O = sc.nextBoolean();

        boolean F = true;

        if ((S.equals("verd")) && (P > 0) && O || (S.equals("groc") && (P > 0) && O || S.equals("vermell"))) {
            F = false;
        } else {
            F = true;
        }

        if (!F) {
            System.out.println("ATURAR");
        } else {
            System.out.println("CONTINUAR");
        }

    }
}
