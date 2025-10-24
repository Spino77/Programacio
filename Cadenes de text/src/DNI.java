import java.util.Locale;
import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //Input = DNI - S'ha de comprovar si la lletra del DNI es correcta //

        String DNI = sc.nextLine();
        String num = DNI.substring(0, 8);

        int num_int = Integer.parseInt(num);
        int modul = num_int % 23;

        String taula = "TRWAGMYFPDXBNJZSQVHLCKE";

        char lletra = taula.charAt(modul);

        char lletraoriginal = DNI.charAt(8);

        boolean resposta = lletra == lletraoriginal;

        System.out.println(resposta);


    }
}
