import java.util.Locale;
import java.util.Scanner;

public class trobarsumands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int resultatSuma = sc.nextInt();
        int quantitatNum = sc.nextInt();

        int[] array = new int[quantitatNum];

        for (int i = 0; i < quantitatNum; i++) {
            array[i] = sc.nextInt();
        }


        for (int i = 0; i < quantitatNum; i++) {
            for (int j = 0; j < quantitatNum; j++) {
                if ((array[i] + array[j]) == resultatSuma && array[i] != array[j]) {
                    System.out.print(array[i] + " " + array[j]);
                    return;
                }
            }
        }
        System.out.print(-1 + " " + -1);
    }
}
