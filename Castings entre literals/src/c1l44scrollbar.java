import java.util.Locale;
import java.util.Scanner;

public class c1l44scrollbar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int vh = sc.nextInt();
        int ch = sc.nextInt();
        int ah = sc.nextInt();

        float proporcio = (float) vh / ch;
        float tsh = vh - (ah * 2);

        float th = proporcio * tsh;
        int th2 = (int) th;

        int sj = vh / th2;

        System.out.println(th2);
        System.out.println(sj);

    }
}
