import java.util.Locale;
import java.util.Scanner;

public class acronimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String S = sc.nextLine();
        String A = "";

        String SU = S.toUpperCase();

        String[] SA = SU.split(" ");

        for (int i = 0; i< SA.length; i++) {
            A += SA[i].charAt(0);
        }

        System.out.println(A);


    }
}
