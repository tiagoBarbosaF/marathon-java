package tiagobarbosa.marathonjava.javacore.Pwrapper.main;

public class WrapperMain01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'T';
        boolean booleanP = false;
        
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'T';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean isTrue = Boolean.parseBoolean(null);
        System.out.println(isTrue);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isLetterOrDigit('?'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
