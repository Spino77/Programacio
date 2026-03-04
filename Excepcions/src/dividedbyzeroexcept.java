import java.util.Locale;
import java.util.Scanner;

public class dividedbyzeroexcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int E = sc.nextInt();

        try {
            System.out.println(10 / E);
        }
        catch (ArithmeticException e) {
            if (e.getMessage().contains("/ by zero")) {
                System.out.println("no funciona tonto");
            }
        }

    }
}
