import javax.sound.midi.MidiFileFormat;
import java.util.Locale;
import java.util.Scanner;

public class c1l19sobrenous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int N = sc.nextInt();

        int M = N % 24;

        int R = 24 - M;

        if (R == 24) {
            int R2 = (0);
            int O2 = (N + R2) / 24;
            System.out.print(O2);
            System.out.print(" ");
            System.out.print(R2);
        } else {
            int O = (N + R) / 24;
            System.out.print(O);
            System.out.print(" ");
            System.out.print(R);
        }
    }
}
