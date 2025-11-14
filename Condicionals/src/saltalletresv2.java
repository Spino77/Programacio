import java.util.Locale;
import java.util.Scanner;

public class saltalletresv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        char lletraChar = sc.next().charAt(0);
        int num = sc.nextInt();

        if (num >= 0) {
            char CharFinal = (char) (lletraChar + num);
            System.out.println(CharFinal);
        } else if (num < 0) {
            char CharFinal = (char) (lletraChar + (num * -1));
            String StringFinal = String.valueOf(CharFinal);
           String StringMayus = StringFinal.toUpperCase();
            System.out.println(StringMayus);
        }


    }
}
