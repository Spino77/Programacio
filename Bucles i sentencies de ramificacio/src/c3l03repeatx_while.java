import java.util.Locale;
import java.util.Scanner;

public class c3l03repeatx_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num = sc.nextInt();
        int i = 0;

        while (i < num) {
            System.out.print(num);
            i += 1;
        }
    }
}
