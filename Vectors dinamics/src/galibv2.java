import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class galibv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        List<Float> hPonts = new ArrayList<Float>();

        while (true) {
            float i = sc.nextFloat();
            if (i < 0) break;
            hPonts.add(i);
        }

        float hCamio = sc.nextFloat();
        for (int i = 0; i < hPonts.size(); i++) {
            float h = hPonts.get(i);
            if (hCamio > h) {
                System.out.println("xoca amb el pont " + (i+1));
                break;
            }
        }
    }
}
