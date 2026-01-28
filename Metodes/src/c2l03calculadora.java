import java.util.Locale;
import java.util.Scanner;

public class c2l03calculadora {
    static void main() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int operador = sc.nextInt();
        calcul(x, y, operador);
    }

    public static int calcul(int x, int y, int op) {
        int var = 0;
        if (op == 1) var = x + y;
        else if (op == 2) var = x - y;
        else if (op == 3) var = x * y;
        else if (op == 4) var = x / y;
        return var;
        }
}
