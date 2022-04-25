package tiagobarbosa.marathonjava.javacore.Npolymorphism.domain;

public class Fruit extends Product{
    public static final double TAXE_PERCENT = 0.06;
    private String expirationDate;

    public Fruit(String name, double value) {
        super(name, value);
    }

    public Fruit(String name, double value, String expirationDate) {
        super(name, value);
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculateTaxes() {
        return this.value * TAXE_PERCENT;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
