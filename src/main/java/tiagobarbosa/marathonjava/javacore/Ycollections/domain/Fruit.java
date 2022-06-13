package tiagobarbosa.marathonjava.javacore.Ycollections.domain;

import java.util.Objects;

public class Fruit implements Comparable<Fruit> {
    private Long id;
    private String name;
    private double price;
    private int quantity;

    public Fruit(Long id, String name, double price) {
        Objects.requireNonNull(id, "Id cannot null");
        Objects.requireNonNull(name, "Name cannot null");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Fruit(Long id, String name, double price, int quantity) {
        this(id, name, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(id, fruit.id) && Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Fruit otherFruit) {
        // if "this" < otherFruit, return -1
        // if "this" == otherFruit, return 0
        // if "this" > otherFruit, return 1
//        if (this.id < otherFruit.getId()) {
//            return -1;
//        } else if (this.id.equals(otherFruit.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
//        return this.id.compareTo(otherFruit.getId());
//        return Double.compare(price, otherFruit.getPrice());
        return this.name.compareTo(otherFruit.getName());
    }
}
