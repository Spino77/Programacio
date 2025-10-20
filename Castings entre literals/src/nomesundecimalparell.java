import java.util.Locale;
import java.util.Scanner;

public class nomesundecimalparell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        int num1_int = (int)num1;
        int num2_int = (int)num2;
        int num3_int = (int)num3;

        boolean parell1 = (num1_int % 2) == 0;
        boolean parell2 = (num2_int % 2) == 0;
        boolean parell3 = (num3_int % 2) == 0;

        boolean ayuda = (parell1 && !parell2 && !parell3) || (!parell1 && parell2 && !parell3) || (!parell1 && !parell2 && parell3);

        System.out.println(ayuda);



    }
}
