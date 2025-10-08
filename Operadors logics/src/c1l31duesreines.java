import java.util.Locale;
import java.util.Scanner;

public class c1l31duesreines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        boolean hor = x1 == x2;
        boolean ver = y1 == y2;

        boolean vh = hor || ver;

        int dix = x1 - x2;

        if (dix < 0) {
            dix = x2 - x1;
        }

        int div = y1 - y2;

        if (div < 0) {
            div = y2 - y1;
        }

        boolean di = dix == div;

        boolean fin = vh || di;

        System.out.println(fin);



    }
}
