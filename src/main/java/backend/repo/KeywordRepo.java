package backend.repo;

import backend.model.Author;
import backend.model.Diploma;
import backend.model.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KeywordRepo  extends JpaRepository<Keyword, Long> {

    void deleteById(Long id);
    Optional<Keyword> findKeywordById(Long id);
}
