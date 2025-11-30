import java.util.Locale;
import java.util.Scanner;

public class alturaminima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        float[] array = new float[N];


        for (int i = 0; i < N; i++) {
            array[i] = sc.nextFloat();
        }

        float HM = sc.nextFloat();

        for (int i = 0; i < N; i++) {
            if (array[i] < HM) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
        }







    }
}
