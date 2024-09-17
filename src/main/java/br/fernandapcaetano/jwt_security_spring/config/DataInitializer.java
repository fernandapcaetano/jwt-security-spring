package br.fernandapcaetano.jwt_security_spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import br.fernandapcaetano.jwt_security_spring.user.Role;
import br.fernandapcaetano.jwt_security_spring.user.User;
import br.fernandapcaetano.jwt_security_spring.user.UserRepository;

@Component
@Configuration
public class DataInitializer {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public CommandLineRunner run() {
        return args -> {
            if (userRepository.findByFirstName("admin") == null) {
                User admin = new User();
                admin.setFirstName("admin");
                admin.setLastName("Maria Fernanda Pereira Caetano");
                admin.setEmail("fernandamariacaetanopereira@gmail.com");
                admin.setPassword(passwordEncoder.encode("123"));
                admin.setRole(Role.ADMIN);
                userRepository.save(admin);
            }
        };
    }
}