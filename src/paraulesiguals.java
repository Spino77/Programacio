import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class paraulesiguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String pl = sc.nextLine();
        String sl = sc.nextLine();

        boolean siono = Objects.equals(sl, pl);

        System.out.println(siono);

    }
}
