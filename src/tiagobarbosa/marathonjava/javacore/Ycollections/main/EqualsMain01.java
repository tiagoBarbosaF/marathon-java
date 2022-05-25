package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Smartphone;

public class EqualsMain01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1DASGHIAU3", "iPhone");
        Smartphone smartphone2 = new Smartphone("1DASGHIAU3", "iPhone");
        System.out.println("smartphone1.equals(smartphone2) -> " + smartphone1.equals(smartphone2));

        smartphone2 = smartphone1;
        System.out.println("smartphone1.equals(smartphone2) -> " + smartphone1.equals(smartphone2));
    }
}
