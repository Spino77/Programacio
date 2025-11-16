import java.util.Locale;
import java.util.Scanner;

public class ultimdecdiv3v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float decimal = sc.nextFloat();
        String decimalString = String.valueOf(decimal);

        int lenght = decimalString.length();
        String ultim = String.valueOf(decimalString.charAt(lenght - 1));
        int num = Integer.parseInt(ultim);

        if (num % 3 == 0) {
            if (num % 5 == 0) {
                System.out.println("L'últim nombre és múltiple de 3.");
                System.out.println("L'últim nombre és múltiple de 5.");
            } else {
                System.out.println("L'últim nombre és múltiple de 3.");
            }
        } else if (num % 5 == 0) {
            System.out.println("L'últim nombre és múltiple de 5.");
        } else {
            System.out.println("Res de res...");
        }
    }
}