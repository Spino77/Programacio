import java.util.Locale;
import java.util.Scanner;

public class c1l22provamecano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float C = sc.nextFloat();
        float E = sc.nextFloat();
        float T = sc.nextFloat();

        float percentatge_float = ((C - E) / C) * 100;
        int percentatge = (int)(percentatge_float); 

        float minuts = T / 60f;
        float velocitat_float = (C / 5f) / minuts;
        int velocitat = (int)(velocitat_float); 

        System.out.println(percentatge);
        System.out.println(velocitat);
    }
}
