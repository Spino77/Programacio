import java.util.Locale;
import java.util.Scanner;

public class c1l35datadepart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int ddc = sc.nextInt();
        int mmc = sc.nextInt();
        int yyc = sc.nextInt();

        int dda = sc.nextInt();
        int mma = sc.nextInt();
        int yya = sc.nextInt();


        boolean dcad = dda > ddc;
        boolean mcad = mma > mmc;
        boolean ycad = yya > yyc;

        boolean syy = yya == yyc;
        boolean smm = mma == mmc;

        boolean cad = false;

        if (syy) {
            if (smm){
                if (dcad) {
                    cad = true;
                }
            }
        }

        if (syy) {
            if (mcad){
                cad = true;
            }
        }

        if (ycad) {
            cad = true;
        }

        System.out.println(cad);
    }
}
