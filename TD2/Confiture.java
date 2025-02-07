package TD2;
public class Confiture {
    final private String fruit;
    private int proportion;
    private int cal;
    Confiture(String fruit, int proportion, int cal){
        this.fruit = fruit;
        this.proportion = proportion;
        this.cal = cal;
    }
    public Confiture(String fruit, int cal) {
        this(fruit, 50, cal);
    }
    public String description() {
        return "Confiture de "+this.fruit+", "+this.proportion+"% de fruit, "+this.cal+" calories aux 100 grammes";
    }
    public boolean egal(Confiture c) {
        return (c.fruit.equals(this.fruit) && c.cal == this.cal && c.proportion == this.proportion);
    }
    public String getFruit() {
        return this.fruit;
    }
    public void modifiyCal(int cal) {
        this.cal = cal;
    }
}
