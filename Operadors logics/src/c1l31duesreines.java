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

        boolean di = (x1 - x2) == (y1 - y2);

        boolean fin = vh || di;

        System.out.println(fin);



    }
}
