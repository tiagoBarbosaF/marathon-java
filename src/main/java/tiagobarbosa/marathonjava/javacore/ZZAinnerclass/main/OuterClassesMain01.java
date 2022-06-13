package tiagobarbosa.marathonjava.javacore.ZZAinnerclass.main;

public class OuterClassesMain01 {
    private String name = "Tiago Barbosa";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesMain01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesMain01 outerClass = new OuterClassesMain01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();
        System.out.println("--------------------------------");

        Inner inner2 = new OuterClassesMain01().new Inner();
        inner2.printOuterClassAttribute();
    }
}
