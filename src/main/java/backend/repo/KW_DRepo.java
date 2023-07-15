package backend.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KW_DRepo extends JpaRepository<backend.model.KW_D, Long> {

    void deleteById(Long id);
    Optional<backend.model.KW_D> findKW_DById(Long id);
}
