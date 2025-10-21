import java.util.Locale;
import java.util.Scanner;

public class inicials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String paraula1 = sc.next();
        String paraula2 = sc.next();

        String paraula1m = paraula1.toUpperCase();
        String paraula2m = paraula2.toUpperCase();

        char lletra1 = paraula1m.charAt(0);
        char lletra2 = paraula2m.charAt(0);

        System.out.print(lletra1);
        System.out.println(lletra2);


    }
}
