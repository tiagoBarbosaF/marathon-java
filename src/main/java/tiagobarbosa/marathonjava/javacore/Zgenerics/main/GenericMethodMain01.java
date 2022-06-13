package tiagobarbosa.marathonjava.javacore.Zgenerics.main;

import tiagobarbosa.marathonjava.javacore.Zgenerics.domain.Boat;

import java.util.List;

public class GenericMethodMain01 {
    public static void main(String[] args) {
        List<Boat> boatList = createArrayWithAObject(new Boat("Speedboat"));
        System.out.println(boatList);
    }

    private static <T> List<T> createArrayWithAObject(T t){
        return List.of(t);
    }

    private static <T extends Comparable<T>> List<T> createArrayWithAObject(T t){
        return List.of(t);
    }
}
