package tiagobarbosa.marathonjava.javacore.Kenum.main;

import tiagobarbosa.marathonjava.javacore.Kenum.domain.Client;
import tiagobarbosa.marathonjava.javacore.Kenum.domain.ClientType;

public class ClientMain01 {
    public static void main(String[] args) {
        Client client01 = new Client("Tiago Barbosa", ClientType.PHYSICAL_PERSON);
        Client client02 = new Client("John Snow", ClientType.PHYSICAL_PERSON);
        Client client03 = new Client("McDonald's", ClientType.LEGAL_PERSON);

        System.out.println(client01);
        System.out.println(client02);
        System.out.println(client03);
    }
}
