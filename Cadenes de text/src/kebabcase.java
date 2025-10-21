import java.util.Locale;
import java.util.Scanner;

public class kebabcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String f = sc.nextLine();

        String fm = f.toLowerCase();

        String ayuda = fm.replace(' ', '-');

        System.out.println(ayuda);


    }
}
