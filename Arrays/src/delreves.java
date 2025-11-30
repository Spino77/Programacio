import java.util.Locale;
import java.util.Scanner;

public class delreves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();
        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = N; i > 0; i--) {
            System.out.print(array[i - 1] + " ");
        }



    }
}
