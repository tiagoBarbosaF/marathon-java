package tiagobarbosa.marathonjava.javacore.Ycollections.domain;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    // Reflexive: x.equals(x) it's true for all things different of null
    // Symmetry: for x and y different from null, if x.equals(y) == true then y.equals(x) == true
    // Transitivity: for x, y, z different of null, if x.equals(y) == true, and x.equals(z) == true then, y.equals(z) == true
    // Consistent: x.equals(x) always return true if x is different of null
    // For x other than null, x.equals(null) must return false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // if x.equals(y) == true, y.equals() == x.equals()
    // y.hashCode() == x.hashCode() don't necessarily the equals of y.equals(x) must true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode(), x.equals(y) must be false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
