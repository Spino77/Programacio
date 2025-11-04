import java.util.Locale;
import java.util.Scanner;

public class controlferroviari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String S = sc.nextLine();
        boolean F = sc.nextBoolean();
        int C = sc.nextInt();

        boolean FF = true;

        if (S.equals("verd") && (!F) && (C == 0)) {
            FF = false;
        } else if (S.equals("àmbar") && (!F) && (C == 0)) {
            FF = false;
        }


        System.out.println("Estat del semàfor (vermell, ambar, verd):");
        System.out.println("Fre d'emergència? (true, false):");
        System.out.println("Ordres del centre de control (0, 1, 2):");
        if (FF == false) {
            System.out.println("El tren pot continuar");
        } else {
            System.out.println("El tren s'ha d'aturar!!");
        }
    }
}
