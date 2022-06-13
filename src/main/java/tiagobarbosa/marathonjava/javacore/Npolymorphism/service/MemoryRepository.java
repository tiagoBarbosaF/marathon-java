package tiagobarbosa.marathonjava.javacore.Npolymorphism.service;

import tiagobarbosa.marathonjava.javacore.Npolymorphism.repositories.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saved in memory.");
    }
}
