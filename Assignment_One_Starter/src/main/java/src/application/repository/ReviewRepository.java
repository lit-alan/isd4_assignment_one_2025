package src.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.application.model.Review;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByBeerId(Long beerId); // Find reviews by beer
    List<Review> findByUserId(Long id); //Find reviews by user
}
