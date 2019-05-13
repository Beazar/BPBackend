package com.example.BPBackend;

import com.example.BPBackend.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BpBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BpBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ContactRepository contactRepository) {
        return args -> {
            contactRepository.save(new Contact("Bill", "Gates", "https://www.toolshero.nl/wp-content/uploads/bill-gates-toolshero.jpg", "046125464"));
            contactRepository.save(new Contact("Jon", "Snow", "https://i.pinimg.com/236x/33/c4/85/33c48517848b291aee1edb07fe2d078d--jon-snow.jpg", "624189294"));
            contactRepository.save(new Contact("Donald", "Duck", "http://spreekbeurten.info/wp-content/uploads/DonaldDuck.jpg", "777637425437"));
        };
    }

}
