package tiagobarbosa.marathonjava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading datas of Database.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions in Database.");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Inside of retrieveMaxDataSize in class DatabaseLoader.");
    }
}
