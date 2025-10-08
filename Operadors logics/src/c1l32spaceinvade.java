import java.util.Locale;
import java.util.Scanner;

public class c1l32spaceinvade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int W1 = sc.nextInt();
        int H1 = sc.nextInt();

        int x2 = x1 + W1;
        int y2 = y1 + H1;

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int W3 = sc.nextInt();
        int H3 = sc.nextInt();

        int x4 = x3 + W3;
        int y4 = y3 + H3;

        boolean ayuda = (x3 >= x2) || (y3 >= y2) || (x1 >= x4) || (y1 >= y4);

        System.out.println(!ayuda);


    }
}
