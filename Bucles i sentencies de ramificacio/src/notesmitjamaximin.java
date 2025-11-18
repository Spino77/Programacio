import java.util.Locale;
import java.util.Scanner;

public class notesmitjamaximin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int NT = N;
        float NOTA = 0;
        float NOTA_MAJOR = 0;
        float NOTA_MENOR = 10;
        String alumne_major = "";
        String alumne_menor = "";
        float NOTA_TOTAL = 0;

        while (N > 0) {

            //lectura dades//
            String NOM = sc.next();
            NOTA = sc.nextFloat();

            //calc nota major//
            if (NOTA > NOTA_MAJOR) {
                NOTA_MAJOR = NOTA;
                alumne_major = NOM;
            }

            //calc nota menor//
            if (NOTA < NOTA_MENOR) {
                NOTA_MENOR = NOTA;
                alumne_menor = NOM;
            }

            //calc mitjana//

            NOTA_TOTAL += NOTA;
            N -= 1;
        }

        float mitjana = NOTA_TOTAL / NT;

        System.out.println("L'alumne amb major nota és el/la " + alumne_major + " amb un " + NOTA_MAJOR);
        System.out.println("L'alumne amb menor nota és el/la " + alumne_menor + " amb un " + NOTA_MENOR);
        System.out.println("La nota mitjana de la classe és de " + mitjana);
    }
}
