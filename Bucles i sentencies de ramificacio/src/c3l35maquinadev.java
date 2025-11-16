import java.util.Locale;
import java.util.Scanner;

public class c3l35maquinadev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int stock = sc.nextInt();
        float price = sc.nextFloat();
        float balance = 0;

        sc.nextLine();

        String input = sc.next();

        System.out.println("Insert coin");

        while (!input.equals("OFF")) {
            if (input.equals("INSERT")) {
                float money = sc.nextFloat();
                sc.nextLine();
                balance = balance + money;
                if (balance == 0) {
                    System.out.println("Insert coin");
                } else {
                    System.out.println("Balance:" +  balance);
                }
            }
            if (input.equals("EXPEND")) {
                if (stock > 0) {
                    if (balance >= price) {
                        stock -= 1;
                        balance = balance - price;
                        System.out.println("Your water, thanks");
                        if (balance == 0) {
                            System.out.println("Insert coin");
                        } else {
                            System.out.println("Balance:" +  balance);
                        }
                    } else {
                        System.out.println("Price:" + price);
                        if (balance == 0) {
                            System.out.println("Insert coin");
                        } else {
                            System.out.println("Balance:" +  balance);
                        }
                    }
                } else {
                    System.out.println("Product unavailable");
                    if (balance == 0) {
                        System.out.println("Insert coin");
                    } else {
                        System.out.println("Balance:" +  balance);
                    }                }
            }
            if (input.equals("REFUND")) {
                System.out.println("Refund:" +  balance);
                balance = 0;
                if (balance == 0) {
                    System.out.println("Insert coin");
                } else {
                    System.out.println("Balance:" +  balance);
                }
            }
            input = sc.next();
        }
    }
}
