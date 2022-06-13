package tiagobarbosa.marathonjava.javacore.Zgenerics.main;

abstract class Animal {
    public abstract void consultation();
}

class Dog extends Animal {
    @Override
    public void consultation() {
        System.out.println("Consulting dog");
    }
}

class Cat extends Animal{
    @Override
    public void consultation() {
        System.out.println("Consulting cat");
    }
}

public class WildcardMain01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsulting(dogs);
        printConsulting(cats);

        Animal[] animals = {new Cat(), new Dog()};
        Animal animal = new Cat();
        printConsulting(animals);
    }

    private static void printConsulting(Animal[] animals){
        for (Animal animal : animals) {
            animal.consultation();
        }

    }
}
