package holapersona;

import java.util.Locale;
import java.util.Scanner;

class Persona {
    String nom;
    public void saludar() {
        System.out.println("Hola, em dic " + nom);
    }
}
public class holapersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        //persona.Persona unaPersona = new persona.Persona();
        //unaPersona.nom = scanner.next();
        //unaPersona.saludar();

        //persona.Persona unaAltraPersona = new persona.Persona();
        //unaAltraPersona.nom = scanner.next();
        //unaAltraPersona.saludar();
    }
}
