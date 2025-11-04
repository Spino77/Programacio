import java.util.Locale;
import java.util.Scanner;

public class c2lo2preudelfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float D = sc.nextFloat();
        int Q = sc.nextInt();

        float P = (float)(D * 0.35);

        if ((Q > 7) && (D > 800)) {
            float descompte = (float) (P * 0.30);
            System.out.println(P - descompte);
        } else {
            System.out.println(P);
        }
    }
}
