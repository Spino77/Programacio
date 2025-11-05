import java.util.Locale;
import java.util.Scanner;

public class calculdenotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float N = sc.nextFloat();

        if (N < 5) {
            System.out.println("INSUFICIENT");
        } else if (N >= 5 && N < 6) {
            System.out.println("SUFICIENT");
        } else if (N >= 6 && N < 7) {
            System.out.println("BE");
        } else if (N >= 7 && N < 8.5) {
            System.out.println("NOTABLE");
        } else if (N >= 8.5 && N < 10) {
            System.out.println("EXCEL.LENT");
        } else if (N == 10) {
            System.out.println("MATRICULA");
        }
    }
}
