package tiagobarbosa.marathonjava.javacore.Hheritage.domain;

public class Person {
    protected String name;
    protected String document;
    protected Address address;

    public Person(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Document: " + this.document);
        System.out.println("Address: " + this.address.getStreet() + ", " + this.address.getZipcode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
