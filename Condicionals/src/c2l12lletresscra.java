import java.util.Locale;
import java.util.Scanner;

public class c2l12lletresscra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String C = sc.nextLine();
        int P = 0;

        if (C.equals("A") || C.equals("E") || C.equals("I") || C.equals("O") || C.equals("U") || C.equals("L") || C.equals("N") || C.equals("R") || C.equals("S") || C.equals("T")) {
            P = 1;
        } else if (C.equals("D") || C.equals("G")) {
            P = 2;
        } else if (C.equals("B") || C.equals("C") || C.equals("M") || C.equals("P")) {
            P = 3;
        } else if (C.equals("F") || C.equals("H") || C.equals("V") || C.equals("W") || C.equals("Y")) {
            P = 4;
        } else if (C.equals("K")) {
            P = 5;
        } else if (C.equals("J") || C.equals("X")) {
            P = 8;
        } else if (C.equals("Q") || C.equals("Z")) {
            P = 10;
        }

        System.out.println(P);

    }
}
