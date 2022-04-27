package tiagobarbosa.marathonjava.javacore.Oexception.runtime.test;

public class RuntimeExceptionMain02 {
    public static void main(String[] args) {
        divider(1, 0);

        System.out.println("Program finished.");
    }

    /**
     * Divider comments
     *
     * @param num01
     * @param num02
     * @return num01/num02
     * @throws IllegalArgumentException if second argument is zero
     */
    private static double divider(double num01, double num02) {
        if (num02 == 0) {
            throw new IllegalArgumentException("Argument invalid, second argument it can not be zero");
        }
        return num01 / num02;
    }
}
