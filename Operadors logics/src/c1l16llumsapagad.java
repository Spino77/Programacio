import java.util.Locale;
import java.util.Scanner;

public class c1l16llumsapagad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean llum1 = sc.nextBoolean();
        boolean llum2 = sc.nextBoolean();
        boolean llum3 = sc.nextBoolean();
        boolean llum4 = sc.nextBoolean();

        boolean total = !llum1 && !llum2 && !llum3 && !llum4;

        System.out.println(total);
    }
}
