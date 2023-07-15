package backend.repo;


import backend.model.Diploma;
import backend.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiplomaRepo extends JpaRepository<Diploma, Long> {

    void deleteById(Long id);
    Optional<Diploma> findDiplomaById(Long id);
}
