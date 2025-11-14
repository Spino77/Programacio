import java.util.Locale;
import java.util.Scanner;

public class c3l02interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = A; i < B; i++) {
            System.out.print(i);
        }
    }
}
