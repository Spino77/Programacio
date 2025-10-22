import java.util.Locale;
import java.util.Scanner;

public class eliminavocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String f = sc.nextLine();

        String fn = f.replaceAll("[aeiou]","");
        String ff = fn.replaceAll("[AEIOU]","");

        System.out.println(ff);



    }
}
