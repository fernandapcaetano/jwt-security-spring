package br.fernandapcaetano.jwt_security_spring.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    Optional<User> findByEmail(String email);

    Object findByFirstName(String string);
}
