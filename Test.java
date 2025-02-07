public class Test {
    public static void main(String[] args) {
        Confiture c1 = new Confiture("Fraise",50,120);
        Confiture c2 = new Confiture("Fraise",50,120);
        System.out.println(c1.egal(c2));
        System.out.println(c1==c2);
    }
}
