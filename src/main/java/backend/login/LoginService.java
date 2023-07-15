package backend.login;

import backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private final LoginRepo loginRepo;

    @Autowired
    public LoginService(LoginRepo loginRepo) {
        this.loginRepo = loginRepo;
    }

    public Optional<User> findActiveUser(String passWd, String username, String email) {
        return loginRepo.findActiveUser(passWd, username, email);
    }


}
