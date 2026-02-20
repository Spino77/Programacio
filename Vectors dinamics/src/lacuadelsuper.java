import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class lacuadelsuper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<String> cua = new ArrayList<String>();

        String cuaTotal = sc.nextLine();
        String cuaNoEspais = cuaTotal.replace(" ", "");
        for (int i = 0; i < cuaNoEspais.length(); i++) {
            cua.add(String.valueOf(cuaNoEspais.charAt(i)));
        }

        int counter = 0;
        int barras = 0;

        for (int i = 0; i < cua.size(); i++) {
            String actual = cua.get(i);
            if (actual.equals("|")) {
                counter ++;
                barras ++;
            } else {
                barras = 0;
            }

            if (barras == 6) {
                System.out.println(counter);
                break;
            }
        }
    }
}
