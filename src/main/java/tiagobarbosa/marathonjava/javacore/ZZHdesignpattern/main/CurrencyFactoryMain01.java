package tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.main;

import tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.domain.Country;
import tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.domain.Currency;
import tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.domain.CurrencyFactory;

public class CurrencyFactoryMain01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());

        Currency currency1 = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(currency1.getSymbol());
    }
}
