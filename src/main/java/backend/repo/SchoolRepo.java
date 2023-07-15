package backend.repo;


import backend.model.Author;
import backend.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchoolRepo extends JpaRepository<School, Long> {

    void deleteById(Long id);
    Optional<School> findSchoolById(Long id);


}
