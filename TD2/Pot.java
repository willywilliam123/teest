package TD2;

public class Pot {
    Confiture confiture;
    int quantite;
    static int numeroPot = 0;
    public Pot(Confiture confiture, int quantite) {
        this.confiture = confiture;
        this.quantite = quantite;
        numeroPot++;
    }
    public static int dernierNumero(){
        return numeroPot;
    }
}
