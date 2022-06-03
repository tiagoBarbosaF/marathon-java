package tiagobarbosa.marathonjava.javacore.ZZAinnerclass.main;

public class OuterClassesMain02 {
    private String name = "Peter";

    void print(final String param) {
        final String lastName = "Mendonça";

        class LocalClass {
            public void printLocal() {
                System.out.println("Param local -> " + param);
                System.out.println("Outer class -> " + name + " - Local class -> " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        new OuterClassesMain02().print("Test param");
    }
}
