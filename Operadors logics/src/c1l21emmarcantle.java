import java.util.Locale;
import java.util.Scanner;

public class c1l21emmarcantle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int w1 = x1 + x2;
        int w2 = x3 + x4;
        int h1 = y1 + y2;
        int h2 = y3 + y4;

        boolean mayoroigual =  (w2 >= w1) && (h2 >= h1);
        boolean proporcionalx = (w2 % w1) <= 1;
        boolean proporcionaly = (h2 % h1) <= 1;

        boolean proporcional = proporcionalx && proporcionaly;

        boolean ayuda = mayoroigual && proporcional;

        System.out.println(ayuda);

    }
}
