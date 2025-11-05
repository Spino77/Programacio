import java.util.Locale;
import java.util.Scanner;

public class streetfighter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String S = sc.next();
        String E = sc.next();

        if (S.equals("IDLE")) {
            if (E.equals("JOYSTICK_UP")) {
                System.out.println("JUMPING");
            } else if (E.equals("PUNCH_KEY")) {
                System.out.println("PUNCHING");
            } else if (E.equals("KICK_KEY")) {
                System.out.println("KICKING");
            } else if (E.equals("JOYSTICK_LEFT/RIGHT")) {
                System.out.println("WALKING");
            } else {
                System.out.println("IDLE");
            }
        }

        if (S.equals("WALKING")) {
            if (E.equals("KICK_KEY")) {
                System.out.println("KICKING");
            } else if (E.equals("PUNCH_KEY")) {
                System.out.println("PUNCHING");
            } else if (E.equals("JOYSTICK_UP")) {
                System.out.println("JUMPING");
            } else if (E.equals("JOYSTICK_CENTER")) {
                System.out.println("IDLE");
            } else {
                System.out.println("WALKING");
            }
        }

        if (S.equals("KICKING")) {
            if (E.equals("KICK_END")) {
                System.out.println("IDLE");
            } else {
                System.out.println("KICKING");
            }
        }

        if (S.equals("PUNCHING")) {
            if (E.equals("PUNCH_END")) {
                System.out.println("IDLE");
            } else {
                System.out.println("PUNCHING");
            }
        }

        if (S.equals("JUMPING")) {
            if (E.equals("TOUCH_FLOOR")) {
                System.out.println("IDLE");
            } else if (E.equals("PUNCH_KEY")) {
                System.out.println("PUNCHING");
            } else if (E.equals("KICK_KEY")) {
                System.out.println("KICKING");
            } else {
                System.out.println("JUMPING");
            }
        }
    }
}
