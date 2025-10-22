import java.util.Locale;
import java.util.Scanner;

public class c5l15reversestri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String S = sc.nextLine();
        String R = "";

        for (int i = 0; i < S.length(); i++){
            R = S.charAt(i) + R;
        }

        System.out.println(R);

    }
}
