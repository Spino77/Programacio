import java.util.Locale;
import java.util.Scanner;

public class horadaperturaopera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String DIA = sc.nextLine();

        if (DIA.equals("Dilluns")) {
            System.out.println("8:00");
        }
        if (DIA.equals("Dimarts")) {
            System.out.println("8:00");
        }
        if (DIA.equals("Dimecres")) {
            System.out.println("8:00");
        }
        if (DIA.equals("Dijous")) {
            System.out.println("8:00");
        }
        if (DIA.equals("Divendres")) {
            System.out.println("8:00");
        }
        if (DIA.equals("Dissabte")) {
            System.out.println("10:00");
        }
        if (DIA.equals("Diumenge")) {
            System.out.println("10:00");
        }

    }
}
