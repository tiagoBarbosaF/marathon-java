package tiagobarbosa.marathonjava.javacore.Zgenerics.main;

import java.util.ArrayList;
import java.util.List;

public class WildcardMain02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        printConsulting(dogs);
        printConsulting(cats);

        List<Animal> animals = new ArrayList<>();
        printConsultingAnimal(animals);
    }

    private static void printConsulting(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consultation();
        }
    }

    private static void printConsultingAnimal(List<? super Animal> animals){
        animals.add(new Cat());
        animals.add(new Dog());
    }
}
