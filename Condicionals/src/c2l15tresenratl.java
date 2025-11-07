import java.util.Locale;
import java.util.Scanner;

public class c2l15tresenratl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int L1N1 = sc.nextInt();
        int L1N2 = sc.nextInt();
        int L1N3 = sc.nextInt();

        int L2N1 = sc.nextInt();
        int L2N2 = sc.nextInt();
        int L2N3 = sc.nextInt();

        int L3N1 = sc.nextInt();
        int L3N2 = sc.nextInt();
        int L3N3 = sc.nextInt();

        boolean J1 = false;
        boolean J2 = false;
        
        //Linia Horitzontal//

        boolean H1J1 = L1N1 == 1 && L1N2 == 1 && L1N3 == 1;
        boolean H2J1 = L2N1 == 1 && L2N2 == 1 && L2N3 == 1;
        boolean H3J1 = L3N1 == 1 && L3N2 == 1 && L3N3 == 1;

        boolean H1J2 = L1N1 == 2 && L1N2 == 2 && L1N3 == 2;
        boolean H2J2 = L2N1 == 2 && L2N2 == 2 && L2N3 == 2;
        boolean H3J2 = L3N1 == 2 && L3N2 == 2 && L3N3 == 2;

        //Linia Vertical//

        boolean V1J1 = L1N1 == 1 && L2N1 == 1 && L3N1 == 1;
        boolean V2J1 = L1N2 == 1 && L2N2 == 1 && L3N2 == 1;
        boolean V3J1 = L1N3 == 1 && L2N3 == 1 && L3N3 == 1;

        boolean V1J2 = L1N1 == 2 && L2N1 == 2 && L3N1 == 2;
        boolean V2J2 = L1N2 == 2 && L2N2 == 2 && L3N2 == 2;
        boolean V3J2 = L1N3 == 2 && L2N3 == 2 && L3N3 == 2;

        //Linia Diagonal//

        boolean D1J1 = L1N1 == 1 && L2N2 == 1 && L3N3 == 1;
        boolean D2J1 = L1N3 == 1 && L2N2 == 1 && L3N1 == 1;

        boolean D1J2 = L1N1 == 2 && L2N2 == 2 && L3N3 == 2;
        boolean D2J2 = L1N3 == 2 && L2N2 == 2 && L3N1 == 2;

        if (H1J1 || H2J1 || H3J1 || V1J1 || V2J1 || V3J1 || D1J1 || D2J1) {
            J1 = true;
        }

        if (H1J2 || H2J2 || H3J2 || V1J2 || V2J2 || V3J2 || D1J2 || D2J2) {
            J2 = true;
        }

        if (J1 && J2 || !J1 && !J2) {
            System.out.println("Empat");
        } else if (J1) {
            System.out.println("Jugador1");
        } else if (J2) {
            System.out.println("Jugador2");
        }
    }
}
