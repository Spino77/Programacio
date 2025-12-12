import java.util.Locale;
import java.util.Scanner;

public class eliminarrepetits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();

        String[] array = new String[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.next();
        }

        for (int i = 0; i < N; i++) {
            boolean repetit = false;
            for (int j = 0; j < i; j++) {
                if (array[i].equals(array[j])) {
                    repetit = true;
                }
            }
            if (!repetit) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
