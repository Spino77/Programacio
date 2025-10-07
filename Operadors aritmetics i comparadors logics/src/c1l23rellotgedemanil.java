import java.util.Locale;
import java.util.Scanner;

public class c1l23rellotgedemanil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float HH = sc.nextFloat();
        float MM = sc.nextFloat();
        float SS = sc.nextFloat();

        float GH = HH * 30;
        float GM = MM * 6;
        float GS = SS * 6;

        float GTM = GM + ((SS / 60) * 6);
        float GTH = GH + (GTM /12);

        System.out.println(GTH);
        System.out.println(GTM);
        System.out.println(GS);

    }
}
