import java.util.Locale;
import java.util.Scanner;

public class c7l22reversestri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String F = sc.nextLine();
        int lenght = F.length();
        char[] array = F.toCharArray();

        for (int i = lenght; i > 0; i--) {
            System.out.print(array[i - 1]);
        }
    }
}
