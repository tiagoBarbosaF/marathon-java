package tiagobarbosa.marathonjava.javacore.Minterfaces.domain;

public interface DataLoader {
    int MAZ_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Checking permissions...");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Inside of retrieveMaxDataSize in interface.");
    }
}
