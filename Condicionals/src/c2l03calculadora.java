import java.util.Locale;
import java.util.Scanner;

public class c2l03calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("MENU:");
        System.out.println("1.-SUMAR");
        System.out.println("2.-RESTAR");
        System.out.println("3.-MULTIPLICAR");
        System.out.println("4.-DIVIDIR");
        System.out.println("Esculli una opcio:");

        int A = sc.nextInt();
        int B = sc.nextInt();
        int Op = sc.nextInt();

        if (Op == 1) {
            System.out.println(A + B);
        }
        if (Op == 2) {
            System.out.println(A - B);
        }
        if (Op == 3) {
            System.out.println(A * B);
        }
        if (Op == 4) {
            System.out.println(A / B);
        }

    }
}
