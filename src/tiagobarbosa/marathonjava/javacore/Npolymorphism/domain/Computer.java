package tiagobarbosa.marathonjava.javacore.Npolymorphism.domain;

public class Computer extends Product{
    public static final double TAXE_PERCENT = 0.21;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxes() {
        return this.value * TAXE_PERCENT;
    }
}
