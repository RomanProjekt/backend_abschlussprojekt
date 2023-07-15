package backend.login;

import backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LoginRepo extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.password = ?1 AND (u.username = ?2 OR u.eMail = ?3)")
    Optional<User> findActiveUser(String password, String username, String email);



}
