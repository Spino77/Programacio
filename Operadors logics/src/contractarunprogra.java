import java.util.Locale;
import java.util.Scanner;

public class contractarunprogra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean java = sc.nextBoolean();
        int anysjava = sc.nextInt();
        boolean python = sc.nextBoolean();
        int anyspy = sc.nextInt();

        boolean aj = anysjava >= 1;
        boolean ap = anyspy >= 3;

        boolean total = (java && aj) || (python && ap);

        System.out.println(total);


    }
}
