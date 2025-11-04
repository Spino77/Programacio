import java.util.Locale;
import java.util.Scanner;

public class c1l18lligadefut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int PGA = sc.nextInt();
        int PEA = sc.nextInt();
        int PPA = sc.nextInt();
        int GFA = sc.nextInt();
        int GCA = sc.nextInt();

        int PGB = sc.nextInt();
        int PEB = sc.nextInt();
        int PPB = sc.nextInt();
        int GFB = sc.nextInt();
        int GCB = sc.nextInt();

        int PA = (PGA * 3) + PEA;
        int PB = (PGB * 3) + PEB;

        int GA = GFA - GCA;
        int GB = GFB - GCB;

        boolean C = true;

        if (PA > PB) {
            C = true;
        } else if (PB > PA) {
            C = false;
        } else if (PA == PB) {
            if (GA > GB) {
                C = true;
            } else if (GB > GA) {
                C = false;
            }
        }
        System.out.println(C);
    }
}
