package tiagobarbosa.marathonjava.javacore.Kenum.main;

import tiagobarbosa.marathonjava.javacore.Kenum.domain.Client;
import tiagobarbosa.marathonjava.javacore.Kenum.domain.ClientType;
import tiagobarbosa.marathonjava.javacore.Kenum.domain.PaymentType;

public class ClientMain01 {
    public static void main(String[] args) {
        Client client01 = new Client("Tiago Barbosa", ClientType.PHYSICAL_PERSON, PaymentType.DEBIT);
        Client client03 = new Client("McDonald's", ClientType.LEGAL_PERSON, PaymentType.CREDIT);
        System.out.println(client01);
        System.out.println(client03);

        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));

        ClientType clientType = ClientType.clientTypeForReportName("Physical person");
        System.out.println(clientType);
    }
}
