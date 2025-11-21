import java.util.Locale;
import java.util.Scanner;

public class galib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float H = sc.nextFloat();
        int N = sc.nextInt();
        float HP = sc.nextFloat();
        int count = 1;
        int count_ponts = 1;


        while (count < N) {
            if (H > HP) {
                System.out.println("xoca amb el pont " + count_ponts);
                break;
            }

            HP = sc.nextFloat();
            count += 1;
            count_ponts += 1;
        }
    }
}
