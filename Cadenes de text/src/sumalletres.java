import java.util.Locale;
import java.util.Scanner;

public class sumalletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String paraula = sc.next();
        char c1 = paraula.charAt(0);
        char c2 = paraula.charAt(1);
        char c3 = paraula.charAt(2);
        char c4 = paraula.charAt(3);
        char c5 = paraula.charAt(4);

        int suma = c1 + c2 + c3 + c4 + c5;

        System.out.println(suma);

    }
}
