import java.util.Locale;
import java.util.Scanner;

public class c3l08showlinenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String frase = sc.nextLine();
        int num = 1;

        while (!frase.equals("END")) {
            System.out.println(" " + num + " | " + frase);
            frase = sc.nextLine();
            num += 1;
        }
    }
}
