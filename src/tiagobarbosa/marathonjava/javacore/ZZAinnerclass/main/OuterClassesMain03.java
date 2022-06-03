package tiagobarbosa.marathonjava.javacore.ZZAinnerclass.main;

public class OuterClassesMain03 {
    private String name = "Tiago";

    static class Nested {
        private String lastname = "Barbosa";

        void print() {
            System.out.println(new OuterClassesMain03().name + " " + lastname);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
