package tiagobarbosa.marathonjava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading datas of file.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permission on files.");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Inside of retrieveMaxDataSize in class FileLoader.");
    }
}
