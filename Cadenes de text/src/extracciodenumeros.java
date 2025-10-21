import java.util.Locale;
import java.util.Scanner;

public class extracciodenumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String f = sc.nextLine();

        char c1 = f.charAt(1);
        char c2 = f.charAt(3);
        char c3 = f.charAt(5);
        char c4 = f.charAt(7);

        int n1 = Character.getNumericValue(c1);
        int n2 = Character.getNumericValue(c2);
        int n3 = Character.getNumericValue(c3);
        int n4 = Character.getNumericValue(c4);

        int suma = n1 + n2 + n3 + n4;

        System.out.println(suma);




    }
}
