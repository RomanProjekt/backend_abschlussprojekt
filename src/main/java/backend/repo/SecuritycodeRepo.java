package backend.repo;

import backend.model.Author;
import backend.model.Securitycode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SecuritycodeRepo extends JpaRepository<Securitycode, Long> {

    void deleteById(Long id);
    Optional<Securitycode> findSecuritycodeById(Long id);
}
