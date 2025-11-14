import java.util.Locale;
import java.util.Scanner;

public class piedrapapeltijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int P1 = 0;
        int P2 = 0;

        String F = sc.nextLine();

        while (!F.equals("END")) {
            if (F.equals("#@") || F.equals("@%") || F.equals("%#")) {
                P1 += 1;
            } else if (F.equals("@#") || F.equals("%@") || F.equals("#%")) {
                P2 += 1;
            }
            F = sc.nextLine();
        }

        if (P1 > P2) {
            System.out.println("1");
        } else if (P2 > P1) {
            System.out.println("2");
        } else {
            System.out.println("-");
        }
    }
}
