import java.util.Locale;
import java.util.Scanner;

public class posiciovalormespetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Nt = sc.nextInt();
        int Ni = sc.nextInt();
        int P = 1;
        int Np = Ni;

        for (int i = 1; i < Nt; i++) {
            Ni = sc.nextInt();
            if (Ni < Np) {
                Np = Ni;
                P = i+1;
            }
        }

        System.out.println("El nombre més petit és el " + Np + " i es troba a la posició " + P);
    }
}
