package tiagobarbosa.marathonjava.javacore.Npolymorphism.main;

import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Computer;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Fruit;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.service.TaxeCalculator;

public class ProductMain01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Macbook", 15000);
        Fruit fruit = new Fruit("Tomato", 10);

        TaxeCalculator.calculateTaxeProduct(computer);
        TaxeCalculator.calculateTaxeProduct(fruit);
    }
}
