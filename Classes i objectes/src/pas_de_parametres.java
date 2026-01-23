class Operacions{
    private boolean disabled;
    public void incrementar(int x, int inc){
        x+=inc;
    }
}


public class pas_de_parametres {
    public static void main(String[] args) {
        int e = 5;
        e--;
        System.out.println(e);


        Operacions ops = new Operacions();
        ops.incrementar(e, 3);
        System.out.println(e);
    }
}
