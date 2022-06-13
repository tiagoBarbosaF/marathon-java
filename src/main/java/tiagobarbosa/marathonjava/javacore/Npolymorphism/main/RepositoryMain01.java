package tiagobarbosa.marathonjava.javacore.Npolymorphism.main;

import tiagobarbosa.marathonjava.javacore.Npolymorphism.repositories.Repository;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.service.DatabaseRepository;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.service.FileRepository;
import tiagobarbosa.marathonjava.javacore.Npolymorphism.service.MemoryRepository;

public class RepositoryMain01 {
    public static void main(String[] args) {
        Repository repository = new MemoryRepository();
        Repository repository1 = new DatabaseRepository();
        Repository repository2 = new FileRepository();

        repository.save();
        repository1.save();
        repository2.save();
    }
}
