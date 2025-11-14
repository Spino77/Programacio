import java.util.Locale;
import java.util.Scanner;

public class sumadeparesyprod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int SP = 0;
        int SS = 1;
        int total = 0;

        int num = sc.nextInt();

        while (num != -1) {

            if ((num % 2) == 0) {
                SP += num;
            } else if ((num % 2) != 0) {
                SS *= num;
            }

            total += 1;
            num = sc.nextInt();
        }

        System.out.println(SP);
        System.out.println(SS);
        System.out.println(total);
    }
}
