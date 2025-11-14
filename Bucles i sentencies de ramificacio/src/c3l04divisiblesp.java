import java.util.Locale;
import java.util.Scanner;

public class c3l04divisiblesp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int A = sc.nextInt();
        int B = sc.nextInt();

        while (A <= B) {
            if ((A % 3) == 0) {
                System.out.println(A);
            }
            A += 1;
        }
    }
}
