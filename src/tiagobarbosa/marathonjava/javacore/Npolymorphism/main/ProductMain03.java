package tiagobarbosa.marathonjava.javacore.Npolymorphism.main;

import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Computer;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Fruit;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Product;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.service.TaxeCalculator;

public class ProductMain03 {
    public static void main(String[] args) {
        Product product = new Computer("Macbook", 13000);
        Fruit fruit = new Fruit("Tomato", 11, "04-30-2022");

        TaxeCalculator.calculateTaxeProduct(product);
        TaxeCalculator.calculateTaxeProduct(fruit);

    }
}
