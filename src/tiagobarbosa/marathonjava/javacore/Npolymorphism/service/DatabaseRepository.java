package tiagobarbosa.marathonjava.javacore.Npolymorphism.service;

import tiagobarbosa.marathonjava.javacore.Npolymorphism.repositories.Repository;

public class DatabaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saved in database.");
    }
}
