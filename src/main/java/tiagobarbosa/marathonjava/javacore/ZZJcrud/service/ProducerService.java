package tiagobarbosa.marathonjava.javacore.ZZJcrud.service;

import tiagobarbosa.marathonjava.javacore.ZZJcrud.domain.Producer;
import tiagobarbosa.marathonjava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type one of the ids below to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found");
            return;
        }
        Producer producerFromDB = producerOptional.get();
        System.out.println("Producer found -> " + producerFromDB);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDB.getName() : name;

        Producer producerToUpdate = Producer.builder()
                .id(producerFromDB.getId())
                .name(name)
                .build();
        ProducerRepository.update(producerToUpdate);
    }
}
