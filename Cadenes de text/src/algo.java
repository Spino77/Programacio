import java.util.Scanner;

public class algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        //Input: Frase amb lletres i numeros

        //Output: Mateixa frase pero només les lletres en majuscula (facilito)

        //Ex: Input = 1hG7k89 | Output = HGK

        String SS = S.replaceAll("[0-9]", "");

        String SSS = SS.toUpperCase();

        System.out.println(SSS);

    }
}
