import java.util.Locale;
import java.util.Scanner;

public class tempsdescarrega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int V = sc.nextInt();
        int T = sc.nextInt();

        int segons = (T * 1024) / V;

        System.out.println(segons);

    }
}
