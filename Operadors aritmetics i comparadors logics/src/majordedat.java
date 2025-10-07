import java.util.Locale;
import java.util.Scanner;

public class majordedat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int edat = sc.nextInt();

        boolean edat2 = edat >= 18;

        System.out.println(edat2);
    }
}
