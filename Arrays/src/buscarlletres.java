import java.util.Locale;
import java.util.Scanner;

public class buscarlletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String F = sc.nextLine();
        String lletra = sc.next();
        char C = lletra.charAt(0);
        int count = 0;
        int lenght = F.length();

        char[] array = F.toCharArray();

        for (int i = 0; i < lenght; i++) {
            if (array[i] == C) {
                count += 1;
            }
        }

        System.out.println(count);

    }
}
