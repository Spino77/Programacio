import java.util.Locale;
import java.util.Scanner;

public class horitzontalsiguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int Files = sc.nextInt();
        int fila_actual = 0;
        int Columnes = sc.nextInt();
        int Columnes_inicial = Columnes;
        int N = 0;
        boolean resultat = false;
        int NS = 0;
        boolean fals = false;

        bucle:
        while (Files > 0) {
            N = sc.nextInt();
            Columnes = Columnes_inicial;
            resultat = true;
            fals = false;
            while (Columnes > 1) {
                NS = sc.nextInt();
                if (N == NS) {
                    resultat = true;
                } else if (N != NS) {
                    resultat = false;
                    fals = true;
                }
                Columnes -= 1;
                N = NS;
            }
            if (resultat == true && fals != true) {
                System.out.println("La fila " + fila_actual + " té tots els números iguals.");
                break bucle;
            }

            fila_actual += 1;
            Files -= 1;
        }
        if (resultat == false) {
            System.out.println("No hi ha cap fila amb els números iguals.");
        }
    }
}
