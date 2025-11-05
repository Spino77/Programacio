import java.util.Locale;
import java.util.Scanner;

public class c1l22secrethands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String FU = "fer l'ullet";
        String DP = "doble parpalleig";
        String TU = "tancar els ulls";
        String S = "saltar";

        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int B3 = sc.nextInt();
        int B4 = sc.nextInt();

        boolean O = B1 == 1;
        boolean D = B2 == 1;
        boolean T = B3 == 1;
        boolean C = B4 == 1;

        if (!O && !D && !T && C) {
            System.out.println(FU);
        }

        if (!O && !D && T && !C) {
            System.out.println(DP);
        }

        if (!O && !D && C && T) {
            System.out.println(FU);
            System.out.println(FU);
        }

        if (!O && D && !T && !C) {
            System.out.println(TU);
        }

        if (!O && D && !T && C) {
            System.out.println(DP);
            System.out.println(FU);
        }

        if (!O && D && T && !C) {
            System.out.println(FU);
            System.out.println(DP);
        }

        if (!O && D && T && C) {
            System.out.println(FU);
            System.out.println(FU);
            System.out.println(FU);
        }

        if (O && !D && !T && !C) {
            System.out.println(S);
        }

        if (O && !D && !T && C) {
            System.out.println(TU);
            System.out.println(FU);
        }

        if (O && !D && T && !C) {
            System.out.println(DP);
            System.out.println(DP);
        }

        if (O && !D && T && C) {
            System.out.println(DP);
            System.out.println(FU);
            System.out.println(FU);
        }

        if (O && D && !T && !C) {
            System.out.println(FU);
            System.out.println(TU);
        }

        if (O && D && !T && C) {
            System.out.println(FU);
            System.out.println(DP);
            System.out.println(FU);
        }

        if (O && D && T && !C) {
            System.out.println(FU);
            System.out.println(FU);
            System.out.println(DP);
        }

        if (O && D && T && C) {
            System.out.println(FU);
            System.out.println(FU);
            System.out.println(FU);
            System.out.println(FU);
        }
    }
}
