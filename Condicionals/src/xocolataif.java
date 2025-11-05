import java.util.Locale;
import java.util.Scanner;

public class xocolataif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int W = sc.nextInt();
        int H = sc.nextInt();
        int Q = sc.nextInt();

        boolean R;

        if ((W * H) > Q) {
            if ((Q % H) == 0 || (Q % W) == 0) {
                R = true;
            } else {
                R = false;
            }
        } else {
            R = false;
        }

        if (R) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
