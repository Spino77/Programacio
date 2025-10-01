import java.util.Locale;
import java.util.Scanner;

public class paella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float comensals = sc.nextFloat();
        float preuarrosperkilo = sc.nextFloat();
        float preugambesperkilo = sc.nextFloat();

        float comensals4 = comensals / 4;

        float pesarros = (float) ((float) comensals4 * 0.5);
        float pesgambes = (float) ((float) comensals4 * 0.25);

        float preuarros = preuarrosperkilo * pesarros;
        float preugambes = preugambesperkilo * pesgambes;

        float total = preuarros + preugambes;

        System.out.println(pesarros + " kg arros");
        System.out.println(pesgambes + " kg gambes");
        System.out.println(preuarros + " euros arros");
        System.out.println(preugambes + " euros gambes");
        System.out.println("TOTAL: " + total + " euros");

    }
}
