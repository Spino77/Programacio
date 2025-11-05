import java.util.Locale;
import java.util.Scanner;

public class timbreinstitut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int H = sc.nextInt();
        int M = sc.nextInt();
        String A = sc.nextLine();

        if (M == 0 && A.equals(" automatic")) {
            System.out.println("RING");
        } else if (A.equals(" manual")) {
            System.out.println("RING");
        } else if (A.equals(" alarma")) {
            System.out.println("RING RING RING");
        } else {
            System.out.println("---");
        }


    }
}
