import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float comensals = sc.nextFloat() / 4;

        float PesA = calcul_pes(comensals, 0.5F);
        float PreuA = calcul_pes(sc.nextFloat(), PesA);
        float PesG = calcul_pes(comensals, 0.25F);
        float PreuG = calcul_pes(sc.nextFloat(), PesG);

        float total = PreuA + PreuG;

        System.out.println(PesA + " kg arros\n" + PesG + " kg gambes\n" + PreuA + " euros arros\n" + PreuG + " euros gambes \n" + "TOTAL: " + total + " euros");
    }
    public static float calcul_pes(float pes, float comensals) {
        float calc_pes = comensals * pes;
        return calc_pes;
    }
    public static float calcul_preu(float preu, float calc_pes) {
        float calc_preu = preu * calc_pes;
        return calc_preu;
    }
}
