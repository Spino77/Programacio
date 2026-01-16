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

        boolean vh = (x1 == x2) || (y1 == y2);
        boolean di = diagonal(x1,x2) == diagonal(y1,y2);
        System.out.println(vh || di);
    }
    public static int diagonal(int n1, int n2) {
        if ((n1 - n2) < 0) { return n2 - n1;
        } else return n1 - n2;
    }
}
