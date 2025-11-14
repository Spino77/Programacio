import java.util.Locale;
import java.util.Scanner;

public class liniapunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(".");
        }
    }
}
