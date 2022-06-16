package tiagobarbosa.marathonjava.javacore.ZZIjdbc.main;

import lombok.extern.log4j.Log4j2;
import tiagobarbosa.marathonjava.javacore.ZZIjdbc.domain.Producer;
import tiagobarbosa.marathonjava.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;
import tiagobarbosa.marathonjava.javacore.ZZIjdbc.service.ProducerServiceRowSet;

import java.util.List;

@Log4j2
public class ConnectionFactoryMain02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MAD2").build();
//        ProducerRepositoryRowSet.updateJdbcRowSet(producerToUpdate);
        ProducerRepositoryRowSet.updateCachedRowSet(producerToUpdate);
        log.info("------------------------------------");
        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
        log.info(producers);
        log.info("------------------------------------");
        for (Producer producer : producers) {
            System.out.printf("Id: %d, Name: %s%n", producer.getId(), producer.getName());
        }

    }
}
