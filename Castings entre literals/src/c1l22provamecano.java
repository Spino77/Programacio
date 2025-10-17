import java.util.Locale;
import java.util.Scanner;

public class c1l22provamecano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float C = sc.nextInt();
        float E = sc.nextInt();
        float T = sc.nextInt();

        float correctes = C - E;
        int percentatge = (int) ((correctes / C) * 100);
        float minuts = (float) T / 60;
        float velocitat_float = (C / minuts) / 5;
        int velocitat = (int) velocitat_float;

        System.out.println(percentatge);
        System.out.println(velocitat);

    }
}
