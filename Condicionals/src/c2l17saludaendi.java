import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class c2l17saludaendi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String I = sc.nextLine();

        if (I == "French") {
            System.out.println("Bonjour");
        } else if (I == "Spanish") {
            System.out.println("Hola");
        } else if (I == "Russian") {
            System.out.println("Zdravstvuyte");
        } else if (I == "Chinese") {
            System.out.println("Nin hao");
        } else if (I == "Japanese") {
            System.out.println("Konnichiwa");
        } else if (I == "German") {
            System.out.println("Guten Tag");
        } else if (I == "Portuguese") {
            System.out.println("Ola");
        } else if (I == "Arabic") {
            System.out.println("Asalaam alaikum");
        } else if (I == "Hindi") {
            System.out.println("Namaste");
        } else if (I == "Romanian") {
            System.out.println("Buna ziua");
        } else {
            System.out.println("No conec el teu idioma, com es diu hola?");
            String IN = sc.nextLine();
            System.out.println(IN);
        }
        {

        }



    }
}
