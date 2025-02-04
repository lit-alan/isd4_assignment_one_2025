package src.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.application.model.User;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<User, Long> {
    //Custom query if needed
    Optional<User> findByEmail(String email);
}
