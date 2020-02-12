package temp.com.example.accessingdatajpa;
/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }

    @Bean
    public CommandLineRunner demo(Book repository) {
        return (args) -> {
            // save a few customers
            repository.save(new Buddy("Jack Bauer", "(647) 121-2121"));
            repository.save(new Buddy("Chloe O'Brian", "(613) 123-4567"));
            repository.save(new Buddy("Kim Bauer", "(647) 121-2121"));


            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Buddy buddyInfo : repository.findAll()) {
                log.info(buddyInfo.toString());
            }
            log.info("");

            // fetch an individual buddyInfo by ID
            Buddy buddyInfo = repository.findById(1L);
            log.info("Buddy found with findById(1L):");
            log.info("--------------------------------");
            log.info(buddyInfo.toString());
            log.info("");

            // fetch customers by last name
            log.info("Buddy found with findByPhoneNumber('(647) 121-2121'):");
            log.info("--------------------------------------------");
            repository.findByPhoneNumber("(647) 121-2121").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Buddy bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }

}*/