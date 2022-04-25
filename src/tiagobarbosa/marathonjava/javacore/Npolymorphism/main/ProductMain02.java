package tiagobarbosa.marathonjava.javacore.Npolymorphism.main;

import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Computer;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Fruit;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Product;

public class ProductMain02 {
    public static void main(String[] args) {
        Product product = new Computer("Macbook", 13000);
        Product product1 = new Fruit("Orange", 15, "04-30-2022");

        System.out.println("== Products ==");
        System.out.println("Name: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Taxes: " + product.calculateTaxes());

        System.out.println("\nName: " + product1.getName());
        System.out.println("Value: " + product1.getValue());
        System.out.println("Taxes: " + product1.calculateTaxes());
    }
}
