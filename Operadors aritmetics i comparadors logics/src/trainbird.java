import java.util.Locale;
import java.util.Scanner;

public class trainbird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float dt = sc.nextFloat();
        float vt = sc.nextFloat();
        float vo = sc.nextFloat();

        float tt = dt / vt;

        float od = vo * tt;

        System.out.println(od);




    }
}
