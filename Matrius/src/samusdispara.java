import java.util.Locale;
import java.util.Scanner;

public class samusdispara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int h = sc.nextInt();
        int w = sc.nextInt();

        String[][] matriu = new String[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matriu[i][j] = sc.next();
            }
        }

        int vertical = h - 1;
        int horitzontal = 0;

        
        String accion = sc.next();

        if (accion.equals("→")) {
                for (int i = 0; i < w; i++) {
                    if (matriu[vertical][i].equals("#")) {
                        System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un obstacle.");
                        return;
                    } else if (matriu[vertical][i].equals("&")) {
                        System.out.println("La Samus ha disparat en línia recta cap a la dreta i ha impactat amb un enemic.");
                        return;
                    } else if (matriu[vertical][i].equals(".")) {
                    }
                }
                System.out.println("La Samus ha disparat en línia recta cap a la dreta i no ha impactat amb res.");
        } else if (accion.equals("↑")) {
                for (int i = h - 1; i >= 0; i--) {
                    if (matriu[i][horitzontal].equals("#")) {
                        System.out.println("La Samus ha disparat en línia recta cap amunt i ha impactat amb un obstacle.");
                        return;
                    } else if (matriu[i][horitzontal].equals("&")) {
                        System.out.println("La Samus ha disparat en línia recta cap amunt i ha impactat amb un enemic.");
                        return;
                    } else if (matriu[i][horitzontal].equals(".")) {
                    }
                }
                System.out.println("La Samus ha disparat en línia recta cap amunt i no ha impactat amb res.");
        }
    }
}
