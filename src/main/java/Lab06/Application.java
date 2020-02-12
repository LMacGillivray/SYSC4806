package Lab06;

import Lab06.Models.Newbook;
import Lab06.Models.Newbud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(Newbook newbook) {
        return (args) -> {
            /*
            newbook.save(new Newbud("John Smith", ("647 123 4444")));
            newbook.save(new Newbud("John Doe", ("647 123 5555")));
            newbook.save(new Newbud("Jeb Bush", ("647 123 6666")));
            newbook.save(new Newbud("Jack Bower", ("647 123 7777")));
            newbook.save(new Newbud("My Daddy", ("1 800 739 8463")));

            log.info("Buddies found with findAll():");
            log.info("-----------------------------");
            for (Newbud nb : newbook.findAll()) {
                log.info(nb.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Newbud nbID = newbook.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(nbID.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            newbook.findByName("John Smith").forEach(johnsmith -> {
                log.info(johnsmith.toString());
            });
            log.info("");*/

        };
    }
}
