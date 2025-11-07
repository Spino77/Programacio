import java.util.Locale;
import java.util.Scanner;

public class vendallibres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String NUMS = sc.nextLine();

        char N1C = NUMS.charAt(0);
        char N2C = NUMS.charAt(1);
        char N3C = NUMS.charAt(2);

        int N1 = Integer.parseInt(String.valueOf(N1C));
        int N2 = Integer.parseInt(String.valueOf(N2C));
        int N3 = Integer.parseInt(String.valueOf(N3C));

        int T = (N1 + N2 + N3);

        String DIA = null;

        if (N1 >= N2 && N1 >= N3) {
            DIA = "Divendres";
        } else if (N3 >= N1 && N3 >= N2) {
            DIA = "Diumenge";
        } else if (N2 >= N1 && N2 >= N3) {
            DIA = "Dissabte";
        }

        System.out.println("La quantitat total de llibres venuts és: " + T);
        System.out.println("El dia amb més ventes ha sigut: " + DIA);
    }
}
