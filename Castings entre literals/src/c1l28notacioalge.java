import java.util.Locale;
import java.util.Scanner;

public class c1l28notacioalge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int lletra = n1 + 96;

        char char1 = (char) lletra;
        System.out.print(char1);
        System.out.println(n2);

    }
}
