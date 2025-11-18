import java.util.Locale;
import java.util.Scanner;

public class eslalom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String F = sc.nextLine();
        int N = 1;

        while (!F.equals("META")) {
            System.out.println(F + " " + N);
            F = sc.nextLine();
            N += 1;
        }
    }
}
