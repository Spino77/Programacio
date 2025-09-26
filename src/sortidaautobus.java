import java.util.Locale;
import java.util.Scanner;

public class sortidaautobus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int num = (A + B) * N;

        System.out.print(num);


    }
}
