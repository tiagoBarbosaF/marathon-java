package tiagobarbosa.marathonjava.javacore.ZZIjdbc.main;

import tiagobarbosa.marathonjava.javacore.ZZIjdbc.domain.Producer;
import tiagobarbosa.marathonjava.javacore.ZZIjdbc.service.ProducerService;

public class ConnectionFactoryMain01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("NHK").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.save(producer);
//        ProducerService.delete(4);
        ProducerService.update(producerToUpdate);
    }
}
