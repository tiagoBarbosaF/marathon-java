package tiagobarbosa.marathonjava.javacore.Minterfaces.main;

import tiagobarbosa.marathonjava.javacore.Minterfaces.domain.DatabaseLoader;
import tiagobarbosa.marathonjava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderMain01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DatabaseLoader.retrieveMaxDataSize();
        FileLoader.retrieveMaxDataSize();
    }
}
