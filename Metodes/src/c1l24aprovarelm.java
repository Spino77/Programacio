import java.util.Locale;
import java.util.Scanner;

public class c1l24aprovarelm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int S = 3;


        int[] array1 = new int[S];
        int[] array2 = new int[S];
        int[] array3 = new int[S];

        for (int i = 0; i < S; i++) {
           array1[i] = sc.nextInt();
        }

        for (int i = 0; i < S; i++) {
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < S; i++) {
            array3[i] = sc.nextInt();
        }

        //UF 1
        //(75% i 4) o (50% i 5) o (>7)

        //UF 2
        //(75% i 4) o (100%) o (50% i 5)

        //UF 3
        // (100% i 5)

        //Comprovacio calculs (var percentatge i nota min)

        boolean UF1 = false;
        boolean UF2 = false;
        boolean UF3 = false;

        if (calcul_aprovat(75, 4,array1) ||
                calcul_aprovat(50, 5, array1) ||
                calcul_aprovat(0, 7,array1)) {
            UF1 = true;
        }

        if (calcul_aprovat(75, 4, array2) ||
                calcul_aprovat(100, 0, array2) ||
                calcul_aprovat(50, 5, array2)) {
            UF2 = true;
        }

        if (calcul_aprovat(100, 5, array3)) {
            UF3 = true;
        }

        if (UF1 && UF2 && UF3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }

    public static boolean calcul_aprovat(int pe, int min, int[] notes) {

        if ((notes[1] / (float) notes[0] >= (float)pe / 100) && notes[2] >= min) {
            return true;
        } else {
            return false;
        }

    }

}










