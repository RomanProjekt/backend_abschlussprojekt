package backend.service;

import backend.model.Keyword;
import backend.model.User;
import backend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public User findUserById(Long id) {
        return userRepo.findUserById(id).orElseThrow(() -> new NotFoundException("User by id " + id + " was nof found"));
    }

    public void deleteUserById(Long id) {
        userRepo.deleteById(id);
    }
}
