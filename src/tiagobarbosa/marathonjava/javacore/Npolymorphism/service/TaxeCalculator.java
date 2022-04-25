package tiagobarbosa.marathonjava.javacore.Npolymorphism.service;

import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Fruit;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.domain.Product;

public class TaxeCalculator {
    public static void calculateTaxeProduct(Product product) {
        System.out.println("== Report taxes of products ==");
        double taxe = product.calculateTaxes();

        System.out.println("Product: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Taxes: " + taxe);
        if (product instanceof Fruit){
            String expirationDate = ((Fruit) product).getExpirationDate();
            System.out.println("Expiration date: "+expirationDate);
        }
    }
}
