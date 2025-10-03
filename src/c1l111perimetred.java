import java.util.Locale;
import java.util.Scanner;

public class c1l111perimetred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();

        int X = X1 - X2;
        int Y = Y1 - Y2;

        int perimetre = (X * 2) + (Y * 2);

        System.out.println(perimetre);

    }
}
