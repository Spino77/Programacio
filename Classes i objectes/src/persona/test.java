package persona;

class Persona {
    private String nom;
    private int edat;

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }
    public String presentarse(){
        return "Hola, em dic " + this.nom;
    }
    public String getNom() {
        return nom;
    }
    public int getEdat() {
        return edat;
    }
    public void setNom(String nom) {
        if(nom == null || nom.isBlank()) return;
        else this.nom = nom;
    }


    public void setEdat(int edat) {
        if(edat < 0) return;
        else this.edat = edat;
    }

}

public class test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Fer", 39);
        System.out.println(p1.presentarse());

        Persona p2 = new Persona("Laia", 27);
        System.out.println(p2.presentarse());

        p1.setEdat(40);
        p2.setEdat(-28);

        System.out.println("L'edat del " + p1.getNom() + " és de " + p1.getEdat() + " anys.");
        System.out.println("L'edat del " + p2.getNom() + " és de " + p2.getEdat() + " anys.");
    }
}
