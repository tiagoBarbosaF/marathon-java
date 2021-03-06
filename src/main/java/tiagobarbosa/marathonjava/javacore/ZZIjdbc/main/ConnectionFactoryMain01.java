package tiagobarbosa.marathonjava.javacore.ZZIjdbc.main;

import lombok.extern.log4j.Log4j2;
import tiagobarbosa.marathonjava.javacore.ZZIjdbc.domain.Producer;
import tiagobarbosa.marathonjava.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionFactoryMain01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Ufotable").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();
//        ProducerService.save(producer);
//        ProducerService.delete(4);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        System.out.println("Producers:");
//        for (Producer producerList : producers) {
//            System.out.printf("Id: %d, Name: %s%n", producerList.getId(), producerList.getName());
//        }
//        System.out.println("----------------------------------------------------");
//
//        List<Producer> byName = ProducerService.findByName("MA");
//        System.out.println("Producers:");
//        for (Producer name : byName) {
//            System.out.printf("Id: %d, Name: %s%n", name.getId(), name.getName());
//        }
//        System.out.println("----------------------------------------------------");
//
//        ProducerService.showProducerMetaData();
//        System.out.println("----------------------------------------------------");
//
//        ProducerService.showDriverMetaData();
//        System.out.println("----------------------------------------------------");
//
//        ProducerService.showTypeScrollWorking();
//        ProducerService.findByNameAndUpdateToUpperCase("table");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A1 - picture");
//        log.info(producers);
//        List<Producer> producers = ProducerService.findByNamePrepareStatement("Bo");
//        log.info(producers);
//        ProducerService.updatePrepareStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("mad");
        log.info(producers);
    }
}
