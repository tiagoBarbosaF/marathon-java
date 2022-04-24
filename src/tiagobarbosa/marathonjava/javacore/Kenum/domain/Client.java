package tiagobarbosa.marathonjava.javacore.Kenum.domain;

public class Client {
    private String name;
    private ClientType clientType;
    private PaymentType paymentType;

    public Client(String name, ClientType clientType, double v) {
        this.name = name;
        this.clientType = clientType;
    }

    public Client(String name, ClientType clientType, PaymentType paymentType) {
        this.name = name;
        this.clientType = clientType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientTypeCode=" + clientType.VALUE +
                ", clientType=" + clientType.REPORT_NAME +
                ", clientType=" + paymentType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
