import java.util.Locale;
import java.util.Scanner;

public class totssenarsocap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean n1 = (num1 % 2) == 0;
        boolean n2 = (num2 % 2) == 0;
        boolean n3 = (num3 % 2) == 0;

        boolean senar = n1 || n2 || n3;

        if (n1 == true)
            if (n2 == true)
                if (n3 == true)
                    senar = false;

        senar = !senar;

        System.out.println(senar);


    }
}
