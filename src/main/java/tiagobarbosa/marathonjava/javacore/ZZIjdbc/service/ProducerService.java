package tiagobarbosa.marathonjava.javacore.ZZIjdbc.service;

import tiagobarbosa.marathonjava.javacore.ZZIjdbc.domain.Producer;
import tiagobarbosa.marathonjava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requiredValidId(id);
        ProducerRepository.delete(id);
    }


    public static void update(Producer producer) {
        requiredValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }


    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    public static void showProducerMetaData() {
        ProducerRepository.showProducerMetaData();
    }

    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    private static void requiredValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
