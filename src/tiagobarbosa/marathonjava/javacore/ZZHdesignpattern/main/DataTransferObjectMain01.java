package tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.main;

import tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.domain.*;

public class DataTransferObjectMain01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("980");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder().firstName("Tiago").lastName("Barbosa").build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName() + " " + person.getLastName())
                .build();

        System.out.println(reportDto);
    }
}
