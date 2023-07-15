package backend.repo;

import backend.model.Author;
import backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    void deleteById(Long id);
    Optional<User> findUserById(Long id);
}
