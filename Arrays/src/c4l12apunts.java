import java.util.Locale;
import java.util.Scanner;

public class c4l12apunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();

        int arrayN[] = new int[N];
        String arrayF[] = new String[N];

        for (int i = 0; i < N; i++) {
            arrayN[i] = sc.nextInt();
            arrayF[i] = sc.nextLine();
        }

        int arrayFinalN[] = new int[N];
        String arrayFinalF[] = new String[N];

        for (int i = 0; i < N; i++) {
            int a = arrayN[i];
            arrayFinalN[a - 1] = arrayN[i];
            arrayFinalF[a - 1] = arrayF[i];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arrayFinalN[i] + " ");
            System.out.println(arrayFinalF[i]);
        }

    }
}
