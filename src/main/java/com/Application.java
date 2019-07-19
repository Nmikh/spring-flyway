package com;

import com.DAO.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication(scanBasePackages = "com")
@EnableJpaRepositories(basePackages = "com")
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner runner(UserRepository repository) {
//        return r -> log.info(repository.findAll().toString());
//    }
}