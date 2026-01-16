import java.util.Locale;
import java.util.Scanner;

public class c1l23rellotgedemanil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float GH = sc.nextFloat() * 30;
        float GM = sc.nextFloat() * 6;
        float GS = sc.nextFloat() * 6;

        float GTM = calc_M(GM, GS);
        float GTH = calc_H(GH, calc_M(GM, GS));

        System.out.println(GTH+"\n"+GTM+"\n"+GS);
    }
    public static float calc_M(float G, float G2) {
        float calc = G + (G2 / 60);
        return calc;
    }
    public static float calc_H(float G, float G2) {
        float calc = G + (G2 /12);
        return calc;
    }
}
