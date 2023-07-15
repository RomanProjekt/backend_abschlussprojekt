package backend.repo;

import backend.model.Author;
import backend.model.Diploma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepo extends JpaRepository<Author, Long> {

    void deleteById(Long id);
    Optional<Author> findAuthorById(Long id);
}
