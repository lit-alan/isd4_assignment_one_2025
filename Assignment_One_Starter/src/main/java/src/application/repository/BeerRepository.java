package src.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.application.model.Beer;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {
}
