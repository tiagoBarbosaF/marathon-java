package tiagobarbosa.marathonjava.javacore.Oexception.runtime.test;

public class RuntimeExceptionMain03 {
    public static void main(String[] args) {
        openConection();
    }

    private static String openConection() {
        try {
            System.out.println("Open file.");
            System.out.println("Writing data in file");
            return "Open connection";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Close resources SO.");
        }
        return null;
    }
}
