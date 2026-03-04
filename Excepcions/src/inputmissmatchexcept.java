import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class inputmissmatchexcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        try {
            System.out.println(sc.nextInt());
        }
        catch (InputMismatchException e) {
            System.out.println("Cal introduïr un nombre enter!");
        }
    }
}
