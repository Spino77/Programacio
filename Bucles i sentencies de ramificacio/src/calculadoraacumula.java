import java.util.Locale;
import java.util.Scanner;

public class calculadoraacumula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float N = 0;
        String C = sc.next();

        if (C.equals("END")) {
            System.out.println(N);
        }

        while (!C.equals("END")) {
            if (C.equals("+")) {
                float NS = sc.nextFloat();
                N += NS;
            } else if (C.equals("-")) {
                float NS = sc.nextFloat();
                N -= NS;
            } else if (C.equals("*")) {
                float NS = sc.nextFloat();
                N *= NS;
            } else if (C.equals("/")) {
                float NS = sc.nextFloat();
                N /= NS;
            }
            System.out.println(N);
            C = sc.next();
        }

    }
}
